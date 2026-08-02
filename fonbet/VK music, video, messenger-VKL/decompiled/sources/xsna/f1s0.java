package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.nzl;

/* compiled from: VideoAlbumsBottomSheetHelper.kt */
/* loaded from: classes7.dex */
public final class f1s0 {

    /* compiled from: VideoAlbumsBottomSheetHelper.kt */
    public static final class a implements u90 {
        public final Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // xsna.u90
        public final Context B() {
            return this.a;
        }

        @Override // xsna.u90
        public final void D(Intent intent, int i, Bundle bundle) {
            this.a.startActivityForResult(intent, i, bundle);
        }

        @Override // xsna.u90
        public final void E(Intent intent) {
            this.a.startActivity(intent, null);
        }
    }

    public static dw20 a(Activity activity, VideoFile videoFile, boolean z, UserId userId, dz20 dz20Var, String str) {
        ContextWrapper contextWrapper;
        VideoApiHelperRepository N4 = ((VideoApiHelperComponent) m7m.a(activity).a(fpf0.a(VideoApiHelperComponent.class))).N4();
        boolean z2 = z && !dhr0.a.c(activity);
        if (z2) {
            dhr0.a.getClass();
            int i = dhr0.u().c;
            contextWrapper = new l7s(activity, dhr0.u().c);
        } else {
            contextWrapper = activity;
        }
        i1s0 i1s0Var = new i1s0(contextWrapper, fkq0.c(userId) ? userId : o25.a().c(), videoFile, N4, str);
        RecyclerPaginatedView recyclerPaginatedView = i1s0Var.k;
        recyclerPaginatedView.setMinimumHeight((int) (iah0.f().heightPixels * 0.5d));
        Drawable a2 = m33.a(R.drawable.vk_icon_add_24, contextWrapper);
        if (a2 != null) {
            a2.setTint(e3m.f(R.attr.vk_ui_text_primary, contextWrapper));
        } else {
            a2 = null;
        }
        dw20.a F = new dw20.b(contextWrapper, null).v0(R.string.video_add_to_playlist).D0(recyclerPaginatedView, false).F(a2, contextWrapper.getString(R.string.videos_create_playlist));
        if (z2) {
            dhr0.a.getClass();
            ((dw20.b) F).u0(dhr0.u().c);
        }
        dw20.b c = ((dw20.b) F).h0(R.string.done, new sk(26, i1s0Var, contextWrapper)).d0(new e1s0(dz20Var, 0)).a0(new pnr0(dz20Var, 1)).b0(new cdr0(1, userId, activity)).t().c(new us90(contextWrapper, new nzl.a(1.0f)));
        c.getClass();
        c.d.F1 = true;
        return c.I0("menu_video_albums_dialog");
    }
}
