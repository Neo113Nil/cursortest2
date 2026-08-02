package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GamesCatalogDetailPagingInteractor.kt */
/* loaded from: classes17.dex */
public final class wat {
    public final kdt a;

    public wat(kdt kdtVar) {
        this.a = kdtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GamesHeaderSectionInfo gamesHeaderSectionInfo, int i, ContinuationImpl continuationImpl) {
        vat vatVar;
        int i2;
        Object h;
        if (continuationImpl instanceof vat) {
            vatVar = (vat) continuationImpl;
            int i3 = vatVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vatVar.label = i3 - Integer.MIN_VALUE;
                vat vatVar2 = vatVar;
                Object obj = vatVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = vatVar2.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.a.a(obj);
                        return (uat) obj;
                    }
                    if (i2 == 2) {
                        kotlin.a.a(obj);
                        return (uat) obj;
                    }
                    if (i2 == 3) {
                        kotlin.a.a(obj);
                        return (uat) obj;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return (uat) obj;
                }
                kotlin.a.a(obj);
                boolean z = gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Collection;
                kdt kdtVar = this.a;
                if (z) {
                    int i4 = ((GamesHeaderSectionInfo.Collection) gamesHeaderSectionInfo).c;
                    vatVar2.L$0 = null;
                    vatVar2.I$0 = i;
                    vatVar2.label = 1;
                    obj = kdtVar.b(i4, 12, i, vatVar2);
                } else if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Genre) {
                    Integer num = new Integer(((GamesHeaderSectionInfo.Genre) gamesHeaderSectionInfo).c);
                    vatVar2.L$0 = null;
                    vatVar2.I$0 = i;
                    vatVar2.label = 2;
                    obj = kdt.h(this.a, null, null, num, i, vatVar2, 3);
                } else if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Section) {
                    GamesHeaderSectionInfo.Section section = (GamesHeaderSectionInfo.Section) gamesHeaderSectionInfo;
                    vatVar2.L$0 = null;
                    vatVar2.I$0 = i;
                    vatVar2.label = 3;
                    SectionIdType sectionIdType = section.c;
                    if (epx.f(sectionIdType, SectionIdType.FriendsActivity.c)) {
                        h = kdtVar.n(i, vatVar2);
                    } else if (epx.f(sectionIdType, SectionIdType.Notifications.c)) {
                        h = kdtVar.o(vatVar2);
                    } else if (sectionIdType instanceof SectionIdType.Custom) {
                        h = kdt.h(this.a, null, arm0.m(10, section.c.d()), null, i, vatVar2, 5);
                    } else {
                        h = kdt.h(this.a, section.c, null, null, i, vatVar2, 6);
                    }
                    obj = h;
                } else {
                    if (!(gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.FriendlyUrl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((GamesHeaderSectionInfo.FriendlyUrl) gamesHeaderSectionInfo).c;
                    vatVar2.L$0 = null;
                    vatVar2.I$0 = i;
                    vatVar2.label = 4;
                    obj = kdtVar.l(str, 12, i, vatVar2);
                }
                return coroutineSingletons;
            }
        }
        vatVar = new vat(this, continuationImpl);
        vat vatVar22 = vatVar;
        Object obj2 = vatVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = vatVar22.label;
        if (i2 == 0) {
        }
    }
}
