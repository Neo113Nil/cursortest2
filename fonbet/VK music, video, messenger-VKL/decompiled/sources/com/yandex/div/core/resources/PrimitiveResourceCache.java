package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import xsna.s3q0;

/* compiled from: PrimitiveResourceCache.kt */
/* loaded from: classes7.dex */
public final class PrimitiveResourceCache extends ResourcesWrapper {
    private final ConcurrentHashMap<Integer, Boolean> booleans;
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelOffsets;
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelSizes;
    private final ConcurrentHashMap<Integer, Float> dimensions;
    private final ConcurrentHashMap<Integer, Integer> integers;
    private TypedValue tmpValue;
    private final Object tmpValueLock;

    public PrimitiveResourceCache(Resources resources) {
        super(resources);
        this.booleans = new ConcurrentHashMap<>();
        this.dimensions = new ConcurrentHashMap<>();
        this.dimensionPixelOffsets = new ConcurrentHashMap<>();
        this.dimensionPixelSizes = new ConcurrentHashMap<>();
        this.integers = new ConcurrentHashMap<>();
        this.tmpValue = new TypedValue();
        this.tmpValueLock = new Object();
    }

    private final TypedValue obtainTempTypedValue() {
        TypedValue typedValue;
        synchronized (this.tmpValueLock) {
            try {
                typedValue = this.tmpValue;
                if (typedValue != null) {
                    this.tmpValue = null;
                } else {
                    typedValue = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    private final void releaseTempTypedValue(TypedValue typedValue) {
        synchronized (this.tmpValueLock) {
            try {
                if (this.tmpValue == null) {
                    this.tmpValue = typedValue;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.booleans;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i));
        if (bool == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            boolean z = true;
            try {
                super.getValue(i, obtainTempTypedValue, true);
                int i2 = obtainTempTypedValue.type;
                if (i2 < 16 || i2 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                if (obtainTempTypedValue.data == 0) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                bool = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return bool.booleanValue();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.dimensions;
        Float f = concurrentHashMap.get(Integer.valueOf(i));
        if (f == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Float valueOf = Float.valueOf(TypedValue.complexToDimension(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                f = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return f.floatValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelOffsets;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                num = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelSizes;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                num = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.integers;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i, obtainTempTypedValue, true);
                int i2 = obtainTempTypedValue.type;
                if (i2 < 16 || i2 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(obtainTempTypedValue.data);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                num = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return num.intValue();
    }
}
