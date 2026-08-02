package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vk.stat.scheme.SchemeStat$EventProductMain.b;

/* compiled from: BaseProductEventBuilder.kt */
/* loaded from: classes11.dex */
public abstract class vk6<Type extends SchemeStat$EventProductMain.b> extends cd6<gsd0> {
    public MobileOfficialAppsCoreNavStat$EventScreen f;
    public Type g;

    public vk6() {
        this(qsk0.a);
    }

    @Override // xsna.cd6
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public gsd0 p() {
        SchemeStat$EventProductMain.b bVar;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) r(this.f);
        if (mobileOfficialAppsCoreNavStat$EventScreen == null || (bVar = (SchemeStat$EventProductMain.b) r(this.g)) == null) {
            return null;
        }
        return new gsd0(mobileOfficialAppsCoreNavStat$EventScreen, bVar, this.d);
    }

    public vk6(irk0 irk0Var) {
        super(false, irk0Var, 7);
    }

    public vk6(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Type type, irk0 irk0Var) {
        super(false, irk0Var, 7);
        this.f = mobileOfficialAppsCoreNavStat$EventScreen;
        this.g = type;
    }
}
