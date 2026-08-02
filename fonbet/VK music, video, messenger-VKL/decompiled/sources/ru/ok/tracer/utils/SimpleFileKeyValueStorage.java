package ru.ok.tracer.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.br;
import xsna.gzs;
import xsna.jgp;
import xsna.pn00;
import xsna.s3q0;
import xsna.u8g0;
import xsna.zcl;

/* compiled from: SimpleFileKeyValueStorage.kt */
/* loaded from: classes11.dex */
public final class SimpleFileKeyValueStorage {
    private static final Companion Companion = new Companion(null);
    private static final int LEGACY_TYPE_CONDITIONS = 7;
    private static final int TYPE_BOOLEAN = 2;
    private static final int TYPE_DOUBLE = 6;
    private static final int TYPE_FLOAT = 5;
    private static final int TYPE_INT = 3;
    private static final int TYPE_LONG = 4;
    private static final int TYPE_STRING = 1;
    private static final int VERSION = 1;
    private final gzs<File> fileSupplier;
    private final Lazy map$delegate = new bpn0(new gzs<AtomicReference<Map<String, ? extends Object>>>() { // from class: ru.ok.tracer.utils.SimpleFileKeyValueStorage$map$2
        {
            super(0);
        }

        @Override // xsna.gzs
        public final AtomicReference<Map<String, ? extends Object>> invoke() {
            Map init;
            init = SimpleFileKeyValueStorage.this.init();
            return new AtomicReference<>(init);
        }
    });

    /* compiled from: SimpleFileKeyValueStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void skipLegacyConditions(DataInputStream dataInputStream) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                dataInputStream.readUTF();
                dataInputStream.readLong();
                dataInputStream.readUTF();
                dataInputStream.readUTF();
                dataInputStream.readLong();
                if (readInt == 1) {
                    dataInputStream.readInt();
                }
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFileKeyValueStorage(gzs<? extends File> gzsVar) {
        this.fileSupplier = gzsVar;
    }

    private final AtomicReference<Map<String, Object>> getMap() {
        return (AtomicReference) this.map$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[LOOP:0: B:16:0x0035->B:21:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> init() {
        Map<String, Object> linkedHashMap;
        Object readUTF;
        jgp jgpVar = jgp.b;
        try {
            File invoke = this.fileSupplier.invoke();
            if (!invoke.exists()) {
                return jgpVar;
            }
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(invoke)));
            try {
                int i = 1;
                if (dataInputStream.readInt() > 1) {
                    linkedHashMap = jgpVar;
                } else {
                    int readInt = dataInputStream.readInt();
                    linkedHashMap = new LinkedHashMap<>();
                    if (1 <= readInt) {
                        while (true) {
                            String readUTF2 = dataInputStream.readUTF();
                            int readInt2 = dataInputStream.readInt();
                            switch (readInt2) {
                                case 1:
                                    readUTF = dataInputStream.readUTF();
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                case 2:
                                    readUTF = Boolean.valueOf(dataInputStream.readBoolean());
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                case 3:
                                    readUTF = Integer.valueOf(dataInputStream.readInt());
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                case 4:
                                    readUTF = Long.valueOf(dataInputStream.readLong());
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                case 5:
                                    readUTF = Float.valueOf(dataInputStream.readFloat());
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                case 6:
                                    readUTF = Double.valueOf(dataInputStream.readDouble());
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                case 7:
                                    Companion.skipLegacyConditions(dataInputStream);
                                    readUTF = s3q0.a;
                                    linkedHashMap.put(readUTF2, readUTF);
                                    if (i == readInt) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Read unknown type " + readInt2 + " with key " + readUTF2);
                            }
                        }
                    }
                }
                dataInputStream.close();
                return linkedHashMap;
            } finally {
            }
        } catch (Exception unused) {
            return jgpVar;
        }
    }

    private final void putInternal(String str, Object obj) {
        AtomicReference<Map<String, Object>> map = getMap();
        while (true) {
            Map<String, Object> map2 = map.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            if (obj == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, obj);
            }
            while (!map.compareAndSet(map2, linkedHashMap)) {
                if (map.get() != map2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeMap() {
        try {
            Map t = pn00.t(getMap().get());
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.fileSupplier.invoke())));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(t.size());
                for (Map.Entry entry : t.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        dataOutputStream.writeInt(2);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeInt(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeInt(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeInt(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeInt(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else {
                        if (!(value instanceof String)) {
                            throw new IllegalArgumentException("Write unknown type of value " + value);
                        }
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF((String) value);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                dataOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final Boolean getBoolean(String str) {
        return (Boolean) getMap().get().get(str);
    }

    public final Float getFloat(String str) {
        return (Float) getMap().get().get(str);
    }

    public final Integer getInt(String str) {
        return (Integer) getMap().get().get(str);
    }

    public final Long getLong(String str) {
        return (Long) getMap().get().get(str);
    }

    public final String getString(String str) {
        return (String) getMap().get().get(str);
    }

    public final void putAll(Map<String, ? extends Object> map) {
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap;
        AtomicReference<Map<String, Object>> map3 = getMap();
        do {
            map2 = map3.get();
            linkedHashMap = new LinkedHashMap(map2);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    linkedHashMap.remove(key);
                } else {
                    linkedHashMap.put(key, value);
                }
            }
        } while (!br.f(map3, map2, linkedHashMap));
    }

    public final void putBoolean(String str, Boolean bool) {
        putInternal(str, bool);
    }

    public final void putFloat(String str, Float f) {
        putInternal(str, f);
    }

    public final Object putInt(String str, Integer num) {
        putInternal(str, num);
        return s3q0.a;
    }

    public final void putLong(String str, Long l) {
        putInternal(str, l);
    }

    public final void putString(String str, String str2) {
        putInternal(str, str2);
    }

    public final void remove(String str) {
        Map<String, Object> map;
        LinkedHashMap linkedHashMap;
        AtomicReference<Map<String, Object>> map2 = getMap();
        do {
            map = map2.get();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(str);
        } while (!br.f(map2, map, linkedHashMap));
    }

    public final void save() {
        TracerThreads.INSTANCE.runInBgSequential(new u8g0(this, 1));
    }
}
