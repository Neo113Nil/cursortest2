package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: ClipsProfileAuthorDescriptionHelper.kt */
/* loaded from: classes17.dex */
public final class fxe {

    /* compiled from: ClipsProfileAuthorDescriptionHelper.kt */
    public static final class a {
        public final String a;
        public final g22 b;
        public final jd c;
        public final g3b d;

        public a(String str, g22 g22Var, jd jdVar, g3b g3bVar) {
            this.a = str;
            this.b = g22Var;
            this.c = jdVar;
            this.d = g3bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DescriptionEditModalBottomSheetParams(initialDescription=" + ((Object) this.a) + ", onSuccessDescriptionChange=" + this.b + ", onCancel=" + this.c + ", onDismiss=" + this.d + ')';
        }
    }

    public static CharSequence a(fxe fxeVar, String str, boolean z) {
        fxeVar.getClass();
        boolean z2 = drm0.Q(str).size() == 1;
        ucp ucpVar = ucp.a;
        return ucp.i((z && z2) ? str : xwk.d().a().d(str, new LinksParserData(47883, (Bundle) null, R.color.vk_sky_300, 0, (String) null, (String) null, R.color.clip_clickable_description, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 15154)));
    }

    public final void b(Context context, String str, Context context2, izs<? super String, s3q0> izsVar) {
        ver0.c(context2, rsg0.y0(yfb.x(new es().m(str)), null, null, 3).subscribe(new io1(new exe(context, context2, str, this, izsVar), 21), new gn0(new e2b(context, context2, str, this, izsVar), 12)));
    }

    public final void c(Context context, Context context2, ClipsAuthor clipsAuthor, String str, izs izsVar) {
        xy2 o;
        o = new zqu().o(fkq0.e(clipsAuthor.b.b), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : str, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
        ver0.c(context2, rsg0.y0(yfb.x(o), null, null, 3).subscribe(new pv2(new cxe(context, context2, clipsAuthor, str, this, izsVar), 11), new ho1(new dxe(context, context2, clipsAuthor, str, this, izsVar), 11)));
    }

    public final void d(final Context context, final Context context2, final ClipsAuthor clipsAuthor, final String str, final izs izsVar) {
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.clip_grid_author_tell_about_yourself_net_error);
        c.U(R.string.clip_grid_author_tell_about_yourself_something_wrong);
        c.W(R.string.clip_grid_author_tell_about_yourself_cancel, null);
        c.c0(R.string.clip_grid_author_tell_about_yourself_retry, new DialogInterface.OnClickListener() { // from class: xsna.axe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UserId userId;
                dialogInterface.dismiss();
                ClipsAuthor clipsAuthor2 = clipsAuthor;
                fxe fxeVar = this;
                Context context3 = context;
                String str2 = str;
                Context context4 = context2;
                izs<? super String, s3q0> izsVar2 = izsVar;
                if (clipsAuthor2 == null || (userId = clipsAuthor2.b.b) == null || !fkq0.b(userId)) {
                    fxeVar.b(context3, str2, context4, izsVar2);
                } else {
                    fxeVar.c(context3, context4, clipsAuthor2, str2, izsVar2);
                }
            }
        });
        c.m();
    }
}
