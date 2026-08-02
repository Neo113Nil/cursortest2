package xsna;

import android.view.View;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b26;

/* compiled from: EndBroadcastView.kt */
/* loaded from: classes16.dex */
public final class hkp implements gz20, gc40, g5q0 {
    public Object b;

    public /* synthetic */ hkp(Object obj) {
        this.b = obj;
    }

    @Override // xsna.gc40
    public List a() {
        ArrayList arrayList = new ArrayList();
        Playlist playlist = (Playlist) this.b;
        if (!jnj.d(playlist.O)) {
            if (playlist.H instanceof DownloadingState.Downloading) {
                arrayList.add(new ec40(R.id.music_action_toggle_download, playlist, R.string.music_menu_my_audios_download_stop, R.string.music_menu_my_audios_download_stop, R.drawable.vk_icon_download_cancel_outline_28, 0, 0, 992));
            } else {
                arrayList.add(new ec40(R.id.music_action_toggle_download, playlist, R.string.music_menu_my_audios_download, R.string.music_menu_my_audios_download, R.drawable.vk_icon_download_outline_28, 0, 0, 992));
            }
        }
        int i = jnj.d(playlist.O) ? R.string.music_menu_kids_my_audios_edit : R.string.music_menu_my_audios_edit;
        arrayList.add(new ec40(R.id.music_action_edit, (Playlist) this.b, i, i, R.drawable.vk_icon_edit_outline_28, 0, 0, 992));
        if (!(playlist.H instanceof DownloadingState.Downloading)) {
            int i2 = jnj.d(playlist.O) ? R.string.music_menu_kids_my_audios_remove_downloaded : R.string.music_menu_my_audios_remove_downloaded;
            arrayList.add(new ec40(R.id.music_action_remove_downloaded, (Playlist) this.b, i2, i2, R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_text_negative, R.attr.vk_ui_text_negative, 896));
        }
        return arrayList;
    }

    @Override // xsna.g5q0
    public f5q0 b(Peer peer) {
        Dialog dialog = (Dialog) ((w2w) this.b).L0(this, new gem(peer));
        return new f5q0(dialog.Jb(), dialog.fc());
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    public void d(View view) {
        ((dpj0) this.b).put(Integer.valueOf(view.getId()), view);
    }

    public void e(View... viewArr) {
        for (View view : viewArr) {
            ((dpj0) this.b).put(Integer.valueOf(view.getId()), view);
        }
    }

    public View f(int i) {
        return (View) ((dpj0) this.b).get(Integer.valueOf(i));
    }

    public void g() {
        b26.f fVar;
        b26.f fVar2;
        pim pimVar = (pim) this.b;
        io.reactivex.rxjava3.disposables.c cVar = pimVar.n;
        if (cVar != null) {
            cVar.dispose();
        }
        pimVar.n = null;
        btk0 btk0Var = pimVar.l;
        boolean z = btk0Var.f;
        boolean z2 = z || btk0Var.g;
        if (z) {
            btk0Var.f = false;
            tim timVar = pimVar.m;
            if (timVar != null) {
                timVar.b();
            }
        }
        s3q0 s3q0Var = s3q0.a;
        btk0 btk0Var2 = pimVar.l;
        boolean z3 = btk0Var2.f || btk0Var2.g;
        if (z2 != z3 && (fVar2 = pimVar.o) != null) {
            b26 b26Var = b26.this;
            if (z3) {
                b26.n(b26Var, b26.a.PINNED, false);
            } else {
                b26Var.g(b26.a.PINNED, true, 0L);
            }
        }
        btk0 btk0Var3 = pimVar.l;
        boolean z4 = btk0Var3.f || btk0Var3.g;
        if (btk0Var3.g) {
            btk0Var3.g = false;
            tim timVar2 = pimVar.m;
            if (timVar2 != null) {
                timVar2.a();
            }
        }
        btk0 btk0Var4 = pimVar.l;
        boolean z5 = btk0Var4.f || btk0Var4.g;
        if (z4 == z5 || (fVar = pimVar.o) == null) {
            return;
        }
        b26 b26Var2 = b26.this;
        if (z5) {
            b26.n(b26Var2, b26.a.PINNED, false);
        } else {
            b26Var2.g(b26.a.PINNED, true, 0L);
        }
    }

    public void h(boolean z) {
        b26.f fVar;
        btk0 btk0Var;
        boolean z2;
        b26.f fVar2;
        b26.f fVar3;
        pim pimVar = (pim) this.b;
        if (!z) {
            boolean Z0 = pimVar.Z0();
            btk0 btk0Var2 = pimVar.l;
            boolean z3 = btk0Var2.f;
            boolean z4 = z3 || btk0Var2.g;
            if (Z0 || z4) {
                return;
            }
            boolean z5 = z3 || btk0Var2.g;
            if (!z3) {
                btk0Var2.f = true;
                tim timVar = pimVar.m;
                if (timVar != null) {
                    timVar.e();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            btk0 btk0Var3 = pimVar.l;
            boolean z6 = btk0Var3.f || btk0Var3.g;
            if (z5 == z6 || (fVar = pimVar.o) == null) {
                return;
            }
            b26 b26Var = b26.this;
            if (z6) {
                b26.n(b26Var, b26.a.PINNED, false);
                return;
            } else {
                b26Var.g(b26.a.PINNED, true, 0L);
                return;
            }
        }
        if (pimVar.Z0() || (z2 = (btk0Var = pimVar.l).g)) {
            return;
        }
        boolean z7 = btk0Var.f;
        boolean z8 = z7 || z2;
        if (z7) {
            btk0Var.f = false;
            tim timVar2 = pimVar.m;
            if (timVar2 != null) {
                timVar2.b();
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
        btk0 btk0Var4 = pimVar.l;
        boolean z9 = btk0Var4.f || btk0Var4.g;
        if (z8 != z9 && (fVar3 = pimVar.o) != null) {
            b26 b26Var2 = b26.this;
            if (z9) {
                b26.n(b26Var2, b26.a.PINNED, false);
            } else {
                b26Var2.g(b26.a.PINNED, true, 0L);
            }
        }
        btk0 btk0Var5 = pimVar.l;
        boolean z10 = btk0Var5.f || btk0Var5.g;
        if (!btk0Var5.g) {
            btk0Var5.g = true;
            tim timVar3 = pimVar.m;
            if (timVar3 != null) {
                timVar3.d();
            }
        }
        btk0 btk0Var6 = pimVar.l;
        boolean z11 = btk0Var6.f || btk0Var6.g;
        if (z10 != z11 && (fVar2 = pimVar.o) != null) {
            b26 b26Var3 = b26.this;
            if (z11) {
                b26.n(b26Var3, b26.a.PINNED, false);
            } else {
                b26Var3.g(b26.a.PINNED, true, 0L);
            }
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        pimVar.n = pimVar.i.F(pimVar, new dvm(Peer.a.b(pimVar.l.a.e), false, pim.r)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new nf1(new e89(pimVar, 5), 26), new sh6(new u9e(pimVar, 2), 17));
    }

    @Override // xsna.gz20
    public void onCancel() {
        ikp ikpVar = (ikp) this.b;
        wjp wjpVar = ikpVar.h;
        if (wjpVar != null) {
            wjpVar.k0();
        }
        ikpVar.g = null;
    }

    public hkp(int i) {
        switch (i) {
            case 6:
                this.b = new uft0();
                break;
            case 7:
                this.b = new dpj0(0);
                break;
            default:
                this.b = new yd10();
                break;
        }
    }
}
