package xsna;

import android.view.View;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.video.VideoAlbum;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.a;
import xsna.zgm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q9f0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.a0, SwipeDrawableRefreshLayout.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q9f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(int i, int i2, int i3, int i4) {
        mjw0 mjw0Var = (mjw0) this.c;
        qiu qiuVar = mjw0Var.h;
        qiuVar.c = i2;
        qiuVar.b();
        mjw0Var.e.b(i2, i4);
        mjw0Var.f.d5(i2, i4);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (gcw) ((il7) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((nl30) this.c).invoke(obj);
            case 2:
                return (tnm0) ((zgm0.c) this.c).invoke(obj);
            default:
                return (VideoAlbum) ((wx30) this.c).invoke(obj);
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((VoipHistoryFriendsFragment) this.c).Q.a(a.f.a);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        String str;
        StartPlaySource startPlaySource = ((n4v0) this.c).b.a;
        String str2 = null;
        StartPlayVkMixSource startPlayVkMixSource = startPlaySource instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) startPlaySource : null;
        if (startPlayVkMixSource != null && (str = startPlayVkMixSource.e) != null && str.length() != 0) {
            str2 = str;
        }
        if (str2 == null) {
            yVar.onError(new IllegalStateException("mix_id is empty on the playback queue restoration"));
        } else {
            yVar.onSuccess(startPlayVkMixSource);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((rzl0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        View view = (View) this.c;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: xsna.pbs0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                io.reactivex.rxjava3.core.r.this.onNext(s3q0.a);
            }
        };
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        rVar.a(new dd5(1, view, onLayoutChangeListener));
    }
}
