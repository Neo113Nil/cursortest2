package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogNotificationBadgeType;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.model.SectionIdType;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GamesCatalogRepository.kt */
/* loaded from: classes17.dex */
public interface kdt {
    static /* synthetic */ Object h(kdt kdtVar, SectionIdType sectionIdType, Integer num, Integer num2, int i, vat vatVar, int i2) {
        if ((i2 & 1) != 0) {
            sectionIdType = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        return kdtVar.m(sectionIdType, num, num2, 12, i, vatVar);
    }

    void a();

    Object b(int i, int i2, int i3, spj<? super uat> spjVar);

    Object c(int i, obt obtVar);

    Object d(tbt tbtVar);

    Object e(GamesCatalogScreenTab gamesCatalogScreenTab, int i, boolean z, cdt cdtVar);

    Object f(long j, nbt nbtVar);

    Object g(spj<? super s3q0> spjVar);

    ey8 i(GamesCatalogScreenTab gamesCatalogScreenTab);

    Object j(WebApiApplication webApiApplication, GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType, spj<? super GamesCatalogNotificationBadgeType> spjVar);

    void k(GamesCatalogScreenTab gamesCatalogScreenTab);

    Object l(String str, int i, int i2, spj<? super uat> spjVar);

    Object m(SectionIdType sectionIdType, Integer num, Integer num2, int i, int i2, spj<? super uat> spjVar);

    Object n(int i, vat vatVar);

    Object o(vat vatVar);

    /* compiled from: GamesCatalogRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final kdt STUB = new C3176a();

        public final kdt getSTUB() {
            return STUB;
        }

        /* compiled from: GamesCatalogRepository.kt */
        /* renamed from: xsna.kdt$a$a, reason: collision with other inner class name */
        public static final class C3176a implements kdt {
            @Override // xsna.kdt
            public final Object b(int i, int i2, int i3, spj<? super uat> spjVar) {
                return new uat(7, (List) null, false);
            }

            @Override // xsna.kdt
            public final Object c(int i, obt obtVar) {
                return s3q0.a;
            }

            @Override // xsna.kdt
            public final Object d(tbt tbtVar) {
                return null;
            }

            @Override // xsna.kdt
            public final Object e(GamesCatalogScreenTab gamesCatalogScreenTab, int i, boolean z, cdt cdtVar) {
                return new adt(null, null, EmptyList.b, 0, 0, false, null);
            }

            @Override // xsna.kdt
            public final Object f(long j, nbt nbtVar) {
                return s3q0.a;
            }

            @Override // xsna.kdt
            public final Object g(spj<? super s3q0> spjVar) {
                return s3q0.a;
            }

            @Override // xsna.kdt
            public final ey8 i(GamesCatalogScreenTab gamesCatalogScreenTab) {
                return null;
            }

            @Override // xsna.kdt
            public final Object j(WebApiApplication webApiApplication, GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType, spj spjVar) {
                return null;
            }

            @Override // xsna.kdt
            public final Object l(String str, int i, int i2, spj<? super uat> spjVar) {
                return new uat(7, (List) null, false);
            }

            @Override // xsna.kdt
            public final Object m(SectionIdType sectionIdType, Integer num, Integer num2, int i, int i2, spj<? super uat> spjVar) {
                return new uat(7, (List) null, false);
            }

            @Override // xsna.kdt
            public final Object n(int i, vat vatVar) {
                return new uat(7, (List) null, false);
            }

            @Override // xsna.kdt
            public final Object o(vat vatVar) {
                return new uat(7, (List) null, false);
            }

            @Override // xsna.kdt
            public final void a() {
            }

            @Override // xsna.kdt
            public final void k(GamesCatalogScreenTab gamesCatalogScreenTab) {
            }
        }
    }
}
