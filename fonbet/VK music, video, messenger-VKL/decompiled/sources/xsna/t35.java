package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.generated.auth.dto.AuthExchangeTokenInfoDto;
import com.vk.api.generated.users.dto.UsersExchangeUserDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2r0;
import xsna.d3b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class t35 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t35(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId f;
        Object obj2;
        String str;
        String str2;
        switch (this.b) {
            case 0:
                List list = (List) this.d;
                c2r0 c2r0Var = (c2r0) this.e;
                Context context = (Context) this.c;
                UserId userId = (UserId) this.f;
                AuthExchangeTokenInfoDto authExchangeTokenInfoDto = (AuthExchangeTokenInfoDto) obj;
                UsersExchangeUserDto e = authExchangeTokenInfoDto.e();
                if (e != null && (f = e.f()) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((c2r0.b) obj2).a, f)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    c2r0.b bVar = (c2r0.b) obj2;
                    if (bVar != null && (str = bVar.g) != null) {
                        boolean equals = f.equals(userId);
                        AccountProfileType accountProfileType = bVar.i;
                        UsersExchangeUserDto e2 = authExchangeTokenInfoDto.e();
                        if (e2 == null || (str2 = e2.e()) == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        UsersExchangeUserDto e3 = authExchangeTokenInfoDto.e();
                        String g = e3 != null ? e3.g() : null;
                        UsersExchangeUserDto e4 = authExchangeTokenInfoDto.e();
                        String i = e4 != null ? e4.i() : null;
                        UsersExchangeUserDto e5 = authExchangeTokenInfoDto.e();
                        String d = e5 != null ? e5.d() : null;
                        UsersExchangeUserDto e6 = authExchangeTokenInfoDto.e();
                        c2r0Var.j(context, new c2r0.b(f, str3, g, i, d, e6 != null ? e6.j() : null, str, equals, 0L, accountProfileType));
                    }
                }
                return s3q0.a;
            case 1:
                d3b d3bVar = (d3b) this.d;
                Context context2 = (Context) this.c;
                String str4 = (String) this.e;
                Integer num = (Integer) this.f;
                int i2 = d3b.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i2 == 1) {
                    if (num != null) {
                        d3bVar.g.a(num.intValue(), str4, false);
                    }
                    if (!d3bVar.e.b(d3bVar.a, new peq0(Uri.parse(str4)), d3bVar.f, d3bVar.h)) {
                        d3bVar.d.b(context2, str4);
                    }
                } else if (i2 == 2) {
                    fvr.l(context2, str4);
                    edw.i(R.string.vkim_copy_to_clipboard_done, context2);
                }
                return s3q0.a;
            case 2:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
                izs izsVar = (izs) this.e;
                rid0 rid0Var = (rid0) this.c;
                ?? r4 = rid0Var.c;
                ah5 ah5Var = rid0Var.b;
                tmc tmcVar = (tmc) this.f;
                omc omcVar = (omc) obj;
                pmc pmcVar = (pmc) linkedHashMap.get(omcVar);
                if (pmcVar != null) {
                    izsVar.invoke(pmcVar);
                    if (pmcVar instanceof c5u) {
                        c5u c5uVar = (c5u) pmcVar;
                        c530 c530Var = c5uVar.h;
                        w530 w530Var = (w530) ah5Var.b;
                        ModerationRestriction a = w530Var.a(c530Var);
                        if (((vnd0) omcVar).b != ProductVideoAttach.StatusType.Adult || !w530Var.b(c530Var, a)) {
                            ((sz00) ah5Var.c).d(rid0Var.a, new qz00(c5uVar.a, c5uVar.b, kid0.a(tmcVar.c), null, null, null, null, null, null, c5uVar.i, CommonMarketStat$TypeMarketContextContent.Type.CLIP, Integer.valueOf(tmcVar.a), Long.valueOf(tmcVar.b.b), 987128));
                        }
                    } else if (pmcVar instanceof vrv0) {
                        String str5 = ((vrv0) pmcVar).d;
                        if (str5 != null) {
                            ((maz) ah5Var.e).d(((tad) r4.getValue()).getContext(), Uri.parse(str5), LaunchContext.A, null);
                        }
                    } else {
                        if (!(pmcVar instanceof l20)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((maz) ah5Var.e).d(((tad) r4.getValue()).getContext(), Uri.parse(((l20) pmcVar).f), new LaunchContext(false, false, false, "from_attached_clip", null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null);
                    }
                }
                return s3q0.a;
            default:
                return io.reactivex.rxjava3.core.x.j(mcr0.h(Uri.parse((String) ((gzs) this.d).invoke()))).l(new qca0(new evh0((azs0) this.e, (String) this.c, (String) this.f, 7), 12));
        }
    }

    public /* synthetic */ t35(d3b d3bVar, Context context, String str, Integer num) {
        this.b = 1;
        this.d = d3bVar;
        this.c = context;
        this.e = str;
        this.f = num;
    }
}
