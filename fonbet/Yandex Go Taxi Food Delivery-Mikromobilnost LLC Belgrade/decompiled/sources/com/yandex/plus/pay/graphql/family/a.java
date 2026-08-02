package com.yandex.plus.pay.graphql.family;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.pay.repository.api.model.family.InviteToFamilyWebUrlResult$Cancelled$Reason;
import defpackage.mww;
import defpackage.nww;
import defpackage.ny61;
import defpackage.oww;
import defpackage.p5z;
import defpackage.pww;
import defpackage.qo2;
import defpackage.qww;
import defpackage.rww;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.vo2;
import defpackage.vww;
import defpackage.w511;
import defpackage.www;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final p5z b;
    public final nww c = new nww();

    public a(qo2 qo2Var, p5z p5zVar) {
        this.a = qo2Var;
        this.b = p5zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GraphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1 graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1;
        int i;
        oww owwVar;
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason;
        if (continuationImpl instanceof GraphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1) {
            graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1 = (GraphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1) continuationImpl;
            int i2 = graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    String upperCase = this.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    skd0.b(PlusLogTag.SDK, "getInviteToFamilyUrl() language=".concat(upperCase));
                    rww rwwVar = new rww(upperCase);
                    graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.L$0 = null;
                    graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, rwwVar, graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "getInviteToFamilyUrl() response=" + vo2Var);
                owwVar = (oww) vo2Var.c;
                if (owwVar != null) {
                    throw new GraphQLParseException("inviteToFamilyUrl response data is null", null);
                }
                this.c.getClass();
                pww pwwVar = owwVar.a;
                qww qwwVar = pwwVar.a;
                if (qwwVar != null) {
                    return new www(qwwVar.a, qwwVar.b);
                }
                switch (mww.a[pwwVar.b.ordinal()]) {
                    case 1:
                        inviteToFamilyWebUrlResult$Cancelled$Reason = InviteToFamilyWebUrlResult$Cancelled$Reason.MAX_FAMILY_MEMBERS;
                        break;
                    case 2:
                        inviteToFamilyWebUrlResult$Cancelled$Reason = InviteToFamilyWebUrlResult$Cancelled$Reason.USER_HAS_NO_FAMILY;
                        break;
                    case 3:
                        inviteToFamilyWebUrlResult$Cancelled$Reason = InviteToFamilyWebUrlResult$Cancelled$Reason.USER_IS_A_FAMILY_CHILD;
                        break;
                    case 4:
                        inviteToFamilyWebUrlResult$Cancelled$Reason = InviteToFamilyWebUrlResult$Cancelled$Reason.USER_REGION_IS_NOT_SUPPORTED;
                        break;
                    case 5:
                    case 6:
                    case 7:
                        inviteToFamilyWebUrlResult$Cancelled$Reason = InviteToFamilyWebUrlResult$Cancelled$Reason.UNKNOWN_REASON;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                return new vww(inviteToFamilyWebUrlResult$Cancelled$Reason);
            }
        }
        graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1 = new GraphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1(this, continuationImpl);
        Object obj2 = graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLWebInviteToFamilyRepository$getInviteToFamilyWebUrl$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "getInviteToFamilyUrl() response=" + vo2Var2);
        owwVar = (oww) vo2Var2.c;
        if (owwVar != null) {
        }
    }
}
