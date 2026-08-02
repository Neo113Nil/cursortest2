package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSource;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.jnq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class anq implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FavePage c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ pqq f;
    public final /* synthetic */ wzs g;
    public final /* synthetic */ Owner h;
    public final /* synthetic */ izs i;

    public /* synthetic */ anq(boolean z, FavePage favePage, boolean z2, Context context, pqq pqqVar, wzs wzsVar, Owner owner, izs izsVar) {
        this.b = z;
        this.c = favePage;
        this.d = z2;
        this.e = context;
        this.f = pqqVar;
        this.g = wzsVar;
        this.h = owner;
        this.i = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer valueOf;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Owner owner = this.h;
        if (booleanValue) {
            boolean z = this.b;
            final boolean z2 = !z;
            final FavePage zb = FavePage.zb(this.c, null, z2, null, 191);
            if (this.d) {
                enq.a.getClass();
                boolean f = epx.f(zb.b, "group");
                if (f) {
                    valueOf = Integer.valueOf(!z ? R.string.fave_add_group : R.string.fave_remove_group);
                } else {
                    if (f) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf = Integer.valueOf(!z ? R.string.fave_add_user : R.string.fave_remove_user);
                }
                int intValue = valueOf.intValue();
                final Context context = this.e;
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_bookmark_circle_fill_yellow_28, (Integer) null, (Size) null, 14);
                aVar.u = new ikv0.d(context.getString(intValue), (String) null, (ikv0.d.a) null, 6);
                aVar.e = 2000L;
                if (!z) {
                    String string = context.getString(!z ? R.string.fave_save_tip_tag : R.string.fave_cancel_remove);
                    final pqq pqqVar = this.f;
                    aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, string, new izs() { // from class: xsna.bnq
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            boolean z3 = z2;
                            Context context2 = context;
                            FavePage favePage = zb;
                            pqq pqqVar2 = pqqVar;
                            if (z3) {
                                int i = jnq.i;
                                jnq.a.a(context2, favePage, pqq.a(pqqVar2, FaveSource.SNACKBAR));
                            } else {
                                enq.k(context2, favePage, pqq.a(pqqVar2, FaveSource.SNACKBAR), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0, null, null, null);
                            }
                            return s3q0.a;
                        }
                    });
                }
                if (pkv0.f(aVar) == null) {
                    L.l("Can't show toast for page without resId, for " + zb);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            p870.f().e(!z ? 1208 : 1209, zb);
            wzs wzsVar = this.g;
            if (wzsVar != null) {
                wzsVar.invoke(Boolean.valueOf(z2), owner.b);
            }
        } else {
            cvk.u(R.string.error, false);
            izs izsVar = this.i;
            if (izsVar != null) {
                izsVar.invoke(owner.b);
            }
        }
        return s3q0.a;
    }
}
