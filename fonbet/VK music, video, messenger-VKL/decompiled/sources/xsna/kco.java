package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.dto.music.Playlist;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vkontakte.android.R;
import java.util.List;
import xsna.av20;
import xsna.dw20;
import xsna.i4a;

/* compiled from: DownloadsInProgressSuspendDialogDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class kco {
    public final lq40 a;

    public kco(lq40 lq40Var) {
        this.a = lq40Var;
    }

    public final void a(Context context, Playlist playlist, gzs<s3q0> gzsVar) {
        List l = e43.l(new i4a.a(57, context.getString(R.string.music_offline_download_action_pause), null), new i4a.a(58, context.getString(R.string.music_offline_download_action_remove), Integer.valueOf(e3m.f(R.attr.vk_ui_text_negative, context))));
        jh3 jh3Var = new jh3(gzsVar, this, playlist, 3);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
        aVar.d = new i4a.b();
        aVar.e = new j4a(jh3Var);
        av20 b = aVar.b();
        b.setItems(l);
        u0q0 u0q0Var = new u0q0(SchemeStat$TypeDialogItem.DialogItem.FRIENDS_PROFILE_ACTIONS, null);
        i4a.a = ((dw20.b) dw20.a.k(new dw20.b(context, null), b, 4)).Z(new gf3(u0q0Var, 1)).e0(new mo8(u0q0Var)).I0("catalog_options");
    }
}
