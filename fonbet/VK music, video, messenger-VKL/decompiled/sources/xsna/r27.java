package xsna;

import android.content.Context;
import com.vk.net.cookie.persistence.SerializableCookie;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BinaryFileCookiePersistor.kt */
/* loaded from: classes.dex */
public final class r27 {
    public final HashMap<String, SerializableCookie> a = new HashMap<>();
    public final File b;
    public final File c;
    public final io.reactivex.rxjava3.subjects.f<HashMap<String, SerializableCookie>> d;

    /* compiled from: BinaryFileCookiePersistor.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<HashMap<String, SerializableCookie>, s3q0> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // xsna.izs
        public final s3q0 invoke(HashMap<String, SerializableCookie> hashMap) {
            InputStreamReader inputStreamReader;
            String str;
            HashMap<String, SerializableCookie> hashMap2 = hashMap;
            r27 r27Var = (r27) this.receiver;
            File file = r27Var.c;
            try {
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        Collection<SerializableCookie> values = hashMap2.values();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : values) {
                            if (((SerializableCookie) obj).d() != null) {
                                arrayList.add(obj);
                            }
                        }
                        objectOutputStream.writeInt(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            objectOutputStream.writeObject((SerializableCookie) it.next());
                        }
                        s3q0 s3q0Var = s3q0.a;
                        objectOutputStream.close();
                        fileOutputStream.close();
                        file.renameTo(r27Var.b);
                    } finally {
                    }
                } finally {
                }
            } catch (FileNotFoundException e) {
                file.delete();
                InputStream inputStream = null;
                try {
                    InputStream inputStream2 = Runtime.getRuntime().exec("df -i").getInputStream();
                    try {
                        inputStreamReader = new InputStreamReader(inputStream2);
                    } catch (Exception unused) {
                        inputStreamReader = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = null;
                    }
                    try {
                        str = a0a.b(inputStreamReader);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused2) {
                                com.vk.metrics.eventtracking.b.a.q(new IOException("descriptors_info:\n".concat(str), e));
                                return s3q0.a;
                            }
                        }
                        inputStreamReader.close();
                    } catch (Exception unused3) {
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                                str = "";
                                com.vk.metrics.eventtracking.b.a.q(new IOException("descriptors_info:\n".concat(str), e));
                                return s3q0.a;
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        str = "";
                        com.vk.metrics.eventtracking.b.a.q(new IOException("descriptors_info:\n".concat(str), e));
                        return s3q0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused5) {
                                throw th;
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        throw th;
                    }
                } catch (Exception unused6) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
                com.vk.metrics.eventtracking.b.a.q(new IOException("descriptors_info:\n".concat(str), e));
            } catch (Throwable th4) {
                file.delete();
                com.vk.metrics.eventtracking.b.a.q(th4);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BinaryFileCookiePersistor.kt */
    public static final class b {
        public static final String a(usj usjVar) {
            return usjVar.a() + usjVar.f() + '|' + usjVar.e();
        }
    }

    public r27(Context context) {
        this.b = new File(context.getApplicationContext().getFilesDir(), "cookie_storage_v1.bin");
        this.c = new File(context.getApplicationContext().getFilesDir(), "cookie_storage_v1.bin.temp");
        io.reactivex.rxjava3.subjects.f<HashMap<String, SerializableCookie>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.d = fVar;
        fVar.D0(BackpressureStrategy.LATEST).j(io.reactivex.rxjava3.schedulers.a.c()).subscribe(new b43(new a(1, this, r27.class, "persistValuesMap", "persistValuesMap(Ljava/util/HashMap;)V", 0), 1), new q27(new p27(0), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        LinkedHashMap linkedHashMap;
        Iterator<T> it;
        HashMap<String, SerializableCookie> hashMap = this.a;
        hashMap.clear();
        boolean exists = new File("cookie_storage.bin").exists();
        Map<? extends String, ? extends SerializableCookie> map = jgp.b;
        if (!exists) {
            File file = this.b;
            if (file.exists()) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            int readInt = objectInputStream.readInt();
                            linkedHashMap = new LinkedHashMap();
                            for (int i = 0; i < readInt; i++) {
                                SerializableCookie serializableCookie = (SerializableCookie) objectInputStream.readObject();
                                usj d = serializableCookie.d();
                                if (d != null) {
                                    linkedHashMap.put(b.a(d), serializableCookie);
                                }
                            }
                            objectInputStream.close();
                            fileInputStream.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    file.delete();
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
            }
            hashMap.putAll(map);
            Collection<SerializableCookie> values = hashMap.values();
            ArrayList arrayList = new ArrayList();
            it = values.iterator();
            while (it.hasNext()) {
                usj d2 = ((SerializableCookie) it.next()).d();
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            return arrayList;
        }
        File file2 = new File("cookie_storage.bin");
        try {
            fileInputStream = new FileInputStream(file2);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    HashMap hashMap2 = (HashMap) objectInputStream.readObject();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        if (((SerializableCookie) entry.getValue()).d() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    objectInputStream.close();
                    fileInputStream.close();
                    file2.delete();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                com.vk.metrics.eventtracking.b.a.q(th2);
            } finally {
                file2.delete();
            }
        }
        map = linkedHashMap;
        hashMap.putAll(map);
        Collection<SerializableCookie> values2 = hashMap.values();
        ArrayList arrayList2 = new ArrayList();
        it = values2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((usj) obj).g()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap<String, SerializableCookie> hashMap = this.a;
            if (!hasNext) {
                this.d.onNext(new HashMap<>(hashMap));
                return;
            } else {
                usj usjVar = (usj) it.next();
                hashMap.put(b.a(usjVar), new SerializableCookie(usjVar));
            }
        }
    }
}
