package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s2;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.SocialProvider;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutAccountProcessing$transform$2", f = "RoundaboutAccountProcessing.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoundaboutAccountProcessing$transform$2 extends SuspendLambda implements wls {
    final /* synthetic */ y1 $data;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundaboutAccountProcessing$transform$2(e eVar, y1 y1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$data = y1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoundaboutAccountProcessing$transform$2(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoundaboutAccountProcessing$transform$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.yandex.passport.internal.ui.bouncer.roundabout.items.SocialProvider] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y1 y1Var;
        Iterator it;
        Object a0Var;
        int i;
        ?? r2;
        ?? r22;
        d1 d1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Throwable th = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        List<t2> list = this.$data.b;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (t2 t2Var : list) {
            if (t2Var instanceof r2) {
                r2 r2Var = (r2) t2Var;
                String phoneNumber = r2Var.a.getPhoneNumber();
                Uid uid = r2Var.c;
                d1Var = (phoneNumber == null || uid == null) ? null : new d1(uid, phoneNumber);
            } else {
                if (!(t2Var instanceof s2)) {
                    w511.b();
                    return null;
                }
                s2 s2Var = (s2) t2Var;
                d1Var = new d1(s2Var.b, s2Var.e);
            }
            if (d1Var != null) {
                arrayList.add(d1Var);
            }
        }
        List I = kotlin.collections.a.I(arrayList);
        y1 y1Var2 = this.$data;
        List list2 = y1Var2.b;
        e eVar2 = this.this$0;
        ListBuilder a = rcc.a();
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it2 = list3.iterator();
        boolean z = false;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                Throwable th2 = th;
                scc.m();
                throw th2;
            }
            t2 t2Var2 = (t2) next;
            LoginProperties loginProperties = y1Var2.a;
            eVar2.getClass();
            boolean z2 = t2Var2 instanceof r2;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.o oVar = com.yandex.passport.internal.ui.bouncer.roundabout.items.l.a;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.o oVar2 = com.yandex.passport.internal.ui.bouncer.roundabout.items.j.a;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.o oVar3 = com.yandex.passport.internal.ui.bouncer.roundabout.items.k.a;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.o oVar4 = com.yandex.passport.internal.ui.bouncer.roundabout.items.g.a;
            Throwable th3 = th;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.o oVar5 = com.yandex.passport.internal.ui.bouncer.roundabout.items.h.a;
            if (z2) {
                r2 r2Var2 = (r2) t2Var2;
                ModernAccount modernAccount = r2Var2.a;
                if (modernAccount.isPhonish()) {
                    a0Var = new com.yandex.passport.internal.ui.bouncer.roundabout.items.b0(modernAccount, modernAccount.getAccountName(), loginProperties.getVisualProperties().getDeleteAccountMessage());
                    y1Var = y1Var2;
                    it = it2;
                } else {
                    String publicName = modernAccount.getPublicName();
                    String displayLogin = modernAccount.getDisplayLogin();
                    String phoneNumber2 = modernAccount.getPhoneNumber();
                    Object nativeDefaultEmail = modernAccount.getNativeDefaultEmail();
                    Object obj2 = nativeDefaultEmail;
                    if (nativeDefaultEmail == null) {
                        String normalizedDisplayLogin = modernAccount.getNormalizedDisplayLogin();
                        if (normalizedDisplayLogin != null) {
                            modernAccount = modernAccount;
                            obj2 = evu0.y(normalizedDisplayLogin, "@", z) ? normalizedDisplayLogin : th3;
                        } else {
                            obj2 = th3;
                        }
                    }
                    String m296getAvatarUrlxSnV4o = modernAccount.m296getAvatarUrlxSnV4o();
                    boolean z3 = (modernAccount.getHasPlus() && loginProperties.getVisualProperties().getAccountListProperties().getMarkPlusUsers()) ? true : z;
                    String nativeDefaultEmail2 = modernAccount.getNativeDefaultEmail();
                    ModernAccount modernAccount2 = modernAccount;
                    if (nativeDefaultEmail2 != null) {
                        boolean s = cvu0.s(nativeDefaultEmail2, ModernAccount.ACCOUNT_NAME_SUFFIX_TEAM, z);
                        i = 1;
                        if (s) {
                            oVar = com.yandex.passport.internal.ui.bouncer.roundabout.items.n.a;
                            Object zVar = new com.yandex.passport.internal.ui.bouncer.roundabout.items.z(modernAccount2, publicName, displayLogin, phoneNumber2, obj2, m296getAvatarUrlxSnV4o, z3, oVar, loginProperties.getVisualProperties().getDeleteAccountMessage(), r2Var2.b, eVar2.a(t2Var2, list2, i2));
                            y1Var = y1Var2;
                            it = it2;
                            a0Var = zVar;
                        }
                    } else {
                        i = 1;
                    }
                    int i4 = d.c[modernAccount2.getAccountType().ordinal()];
                    if (i4 != i) {
                        if (i4 == 2) {
                            oVar = oVar2;
                        } else if (i4 == 3) {
                            oVar = oVar3;
                        } else if (i4 != 4) {
                            if (i4 == 5) {
                                oVar = oVar4;
                            }
                            oVar = oVar5;
                        } else {
                            String socialProviderCode = modernAccount2.getSocialProviderCode();
                            if (socialProviderCode != null) {
                                SocialConfiguration.Companion.getClass();
                                r2 = com.yandex.passport.internal.y.b(socialProviderCode);
                            } else {
                                r2 = th3;
                            }
                            switch (r2 == 0 ? -1 : d.b[r2.ordinal()]) {
                                case 1:
                                    r22 = SocialProvider.VKONTAKTE;
                                    break;
                                case 2:
                                    r22 = SocialProvider.FACEBOOK;
                                    break;
                                case 3:
                                    r22 = SocialProvider.TWITTER;
                                    break;
                                case 4:
                                    r22 = SocialProvider.ODNOKLASSNIKI;
                                    break;
                                case 5:
                                    r22 = SocialProvider.MAILRU;
                                    break;
                                case 6:
                                    r22 = SocialProvider.GOOGLE;
                                    break;
                                case 7:
                                    r22 = SocialProvider.ESIA;
                                    break;
                                case 8:
                                    r22 = SocialProvider.TV1001;
                                    break;
                                default:
                                    r22 = th3;
                                    break;
                            }
                            if (r22 != 0) {
                                oVar = new com.yandex.passport.internal.ui.bouncer.roundabout.items.m(r22);
                            }
                            oVar = oVar5;
                        }
                    } else if (!modernAccount2.isPortal()) {
                        oVar = com.yandex.passport.internal.ui.bouncer.roundabout.items.i.a;
                    }
                    Object zVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.z(modernAccount2, publicName, displayLogin, phoneNumber2, obj2, m296getAvatarUrlxSnV4o, z3, oVar, loginProperties.getVisualProperties().getDeleteAccountMessage(), r2Var2.b, eVar2.a(t2Var2, list2, i2));
                    y1Var = y1Var2;
                    it = it2;
                    a0Var = zVar2;
                }
            } else {
                if (!(t2Var2 instanceof s2)) {
                    w511.b();
                    return th3;
                }
                s2 s2Var2 = (s2) t2Var2;
                Uid uid2 = s2Var2.a;
                Uid uid3 = s2Var2.b;
                String str = s2Var2.c;
                String str2 = s2Var2.d;
                y1Var = y1Var2;
                String str3 = s2Var2.e;
                String str4 = s2Var2.f;
                List list4 = s2Var2.i;
                int i5 = d.a[s2Var2.g.ordinal()];
                it = it2;
                a0Var = new com.yandex.passport.internal.ui.bouncer.roundabout.items.a0(uid2, uid3, str, str2, str3, str4, list4, i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? oVar5 : oVar4 : oVar3 : oVar2 : oVar, s2Var2.h, eVar2.a(t2Var2, list2, i2));
            }
            arrayList2.add(a0Var);
            i2 = i3;
            th = th3;
            y1Var2 = y1Var;
            it2 = it;
            z = false;
        }
        a.addAll(arrayList2);
        boolean z4 = !I.isEmpty() && ((Boolean) eVar2.d.b(com.yandex.passport.internal.flags.q.c)).booleanValue() && ((Boolean) eVar2.d.b(com.yandex.passport.internal.flags.q.r0)).booleanValue();
        a.add(new com.yandex.passport.internal.ui.bouncer.roundabout.items.w(z4));
        if (z4) {
            a.add(new com.yandex.passport.internal.ui.bouncer.roundabout.items.y(I));
        }
        return a.j();
    }
}
