package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import xsna.b890;
import xsna.ccy;
import xsna.ecy;
import xsna.fpf0;
import xsna.vcy;

/* loaded from: classes11.dex */
public abstract class CallableReference implements ccy, Serializable {
    public static final Object NO_RECEIVER = a.b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ccy reflected;
    private final String signature;

    public static class a implements Serializable {
        public static final a b = new a();

        private Object readResolve() throws ObjectStreamException {
            return b;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // xsna.ccy
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // xsna.ccy
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ccy compute() {
        ccy ccyVar = this.reflected;
        if (ccyVar != null) {
            return ccyVar;
        }
        ccy computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract ccy computeReflected();

    @Override // xsna.bcy
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // xsna.ccy
    public String getName() {
        return this.name;
    }

    public ecy getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return fpf0.a(cls);
        }
        fpf0.a.getClass();
        return new b890(cls);
    }

    @Override // xsna.ccy
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public ccy getReflected() {
        ccy compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // xsna.ccy
    public vcy getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // xsna.ccy
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // xsna.ccy
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // xsna.ccy
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // xsna.ccy
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // xsna.ccy
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // xsna.ccy
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
