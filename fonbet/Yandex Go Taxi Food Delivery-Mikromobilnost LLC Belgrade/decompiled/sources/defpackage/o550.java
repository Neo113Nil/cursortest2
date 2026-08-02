package defpackage;

/* loaded from: classes10.dex */
public final class o550 extends s550 {
    public final Class s;

    public o550(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            w511.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.s550, defpackage.t550
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.s550
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (cvu0.t(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder x = unr0.x("Enum value ", str, " not found for type ");
        x.append(cls.getName());
        x.append('.');
        throw new IllegalArgumentException(x.toString());
    }
}
