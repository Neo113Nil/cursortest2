package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.ixd;
import xsna.myd;
import xsna.q0e;

/* compiled from: ClipsEditorMusicActionsControllerImpl.kt */
/* loaded from: classes16.dex */
public final class oyd implements myd {
    public final e2e a;
    public final szd b;
    public final q0e.b c;
    public io.reactivex.rxjava3.disposables.c d;
    public final syd e;

    public oyd(c9d c9dVar, e2e e2eVar, szd szdVar, hwd hwdVar, q0e.b bVar) {
        this.a = e2eVar;
        this.b = szdVar;
        this.c = bVar;
        ryd rydVar = e2eVar.c;
        this.e = new uyd(new n550(c9dVar, new nyd(0, bVar, myd.a.class, "openGalleryForMusicFromVideo", "openGalleryForMusicFromVideo()V", 0)));
    }

    @Override // xsna.myd
    public final void a(Context context, View view) {
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        String string = context.getString(R.string.clip_editor_sound_option_music);
        ixd ixdVar = ad0.g;
        if (ixdVar == null) {
            ixdVar = null;
        }
        ixd.b bVar2 = ixdVar.a;
        e3m.a aVar = e3m.a;
        VkContextMenu.a aVar2 = new VkContextMenu.a(string, m33.a(R.drawable.vk_icon_music_outline_24, context), null, false, false, new mk(2, this, context), 28);
        if (!this.a.k.c.j.a) {
            aVar2 = null;
        }
        String string2 = context.getString(R.string.clip_editor_sound_option_voiceover);
        ixd ixdVar2 = ad0.g;
        if (ixdVar2 == null) {
            ixdVar2 = null;
        }
        ixd.b bVar3 = ixdVar2.a;
        VkContextMenu.a aVar3 = new VkContextMenu.a(string2, m33.a(R.drawable.vk_icon_voice_outline_24, context), null, false, false, new ka0(this, 22), 28);
        String string3 = context.getString(R.string.clip_editor_sound_option_extract);
        ixd ixdVar3 = ad0.g;
        ixd.b bVar4 = (ixdVar3 != null ? ixdVar3 : null).a;
        bVar.h(rl3.I(new VkContextMenu.a[]{aVar2, aVar3, new VkContextMenu.a(string3, m33.a(R.drawable.vk_icon_video_arrow_square_outline_24, context), null, false, false, new vf0(this, 23), 28)}));
        bVar.e = context;
        bVar.g(R.attr.vk_ui_icon_primary);
        VkContextMenu.c.k(bVar);
    }

    @Override // xsna.myd
    public final void b(Context context) {
        this.e.a(context, new xx9(1, this, context));
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.myd
    public final void dispose() {
        this.e.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
