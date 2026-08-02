package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import defpackage.tls;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J^\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/div/core/resources/PrimitiveResourceCache;", "Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "baseResources", "<init>", "(Landroid/content/res/Resources;)V", "", "T", "", "id", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "Lkotlin/Function1;", "Landroid/util/TypedValue;", "", "validate", "transform", "getAndCacheIfPossible", "(ILjava/util/concurrent/ConcurrentHashMap;Ltls;Ltls;)Ljava/lang/Object;", "obtainTempTypedValue", "()Landroid/util/TypedValue;", "value", "Lzy11;", "releaseTempTypedValue", "(Landroid/util/TypedValue;)V", "getBoolean", "(I)Z", "", "getDimension", "(I)F", "getDimensionPixelOffset", "(I)I", "getDimensionPixelSize", "getInteger", "booleans", "Ljava/util/concurrent/ConcurrentHashMap;", "dimensions", "dimensionPixelOffsets", "dimensionPixelSizes", "integers", "tmpValue", "Landroid/util/TypedValue;", "Ljava/lang/Object;", "tmpValueLock", "Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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

    private final <T> T getAndCacheIfPossible(int id, ConcurrentHashMap<Integer, T> cache, tls validate, tls transform) throws Resources.NotFoundException {
        T t = cache.get(Integer.valueOf(id));
        if (t != null) {
            return t;
        }
        TypedValue obtainTempTypedValue = obtainTempTypedValue();
        try {
            super.getValue(id, obtainTempTypedValue, true);
            if (((Boolean) validate.invoke(obtainTempTypedValue)).booleanValue()) {
                T t2 = (T) transform.invoke(obtainTempTypedValue);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    cache.putIfAbsent(Integer.valueOf(id), t2);
                }
                return t2;
            }
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
        } finally {
            releaseTempTypedValue(obtainTempTypedValue);
        }
    }

    private final TypedValue obtainTempTypedValue() {
        TypedValue typedValue;
        synchronized (this.tmpValueLock) {
            typedValue = this.tmpValue;
            if (typedValue != null) {
                this.tmpValue = null;
            } else {
                typedValue = null;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    private final void releaseTempTypedValue(TypedValue value) {
        synchronized (this.tmpValueLock) {
            if (this.tmpValue == null) {
                this.tmpValue = value;
            }
        }
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public boolean getBoolean(int id) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.booleans;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(id));
        if (bool == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            boolean z = true;
            try {
                super.getValue(id, obtainTempTypedValue, true);
                int i = obtainTempTypedValue.type;
                if (i < 16 || i > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                if (obtainTempTypedValue.data == 0) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id), valueOf);
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

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public float getDimension(int id) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.dimensions;
        Float f = concurrentHashMap.get(Integer.valueOf(id));
        if (f == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Float valueOf = Float.valueOf(TypedValue.complexToDimension(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id), valueOf);
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

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelOffset(int id) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelOffsets;
        Integer num = concurrentHashMap.get(Integer.valueOf(id));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id), valueOf);
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

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelSize(int id) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelSizes;
        Integer num = concurrentHashMap.get(Integer.valueOf(id));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id), valueOf);
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

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getInteger(int id) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.integers;
        Integer num = concurrentHashMap.get(Integer.valueOf(id));
        if (num == null) {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id, obtainTempTypedValue, true);
                int i = obtainTempTypedValue.type;
                if (i < 16 || i > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(obtainTempTypedValue.data);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id), valueOf);
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
