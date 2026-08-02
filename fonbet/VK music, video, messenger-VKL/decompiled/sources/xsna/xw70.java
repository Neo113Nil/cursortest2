package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import ru.ok.gl.tf.Tensorflow;
import xsna.enc0;
import xsna.l5v0;
import xsna.taw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw70 implements Tensorflow.InitializeCallback, io.reactivex.rxjava3.functions.l, c.b, xlj, io.reactivex.rxjava3.functions.m, wut0, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (String) ((ekh) this.c).invoke(obj);
            case 2:
                return (com.vk.newsfeed.posting.geo_picker.presentation.g) ((v63) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.e) ((com) this.c).invoke(obj);
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            default:
                return (taw0.a) ((t6c0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((hsc0) this.c).invoke(obj);
            case 10:
                return (hxq0) ((hsc0) this.c).invoke(obj);
            case 11:
                return (Set) ((t6c0) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((hsc0) this.c).invoke(obj);
            case 15:
                return (l5v0.a.d) ((t6c0) this.c).invoke(obj);
            case 16:
                return (List) ((av70) this.c).invoke(obj);
            case 17:
                return (byte[]) ((xau0) this.c).invoke(obj);
        }
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        enc0 enc0Var = (enc0) this.c;
        View view = enc0Var.c;
        MediaPickerState.Tab tab = (MediaPickerState.Tab) j5g.b0(i, enc0.q0);
        int i2 = tab == null ? -1 : enc0.a.$EnumSwitchMapping$0[tab.ordinal()];
        gVar.q(i2 != 1 ? i2 != 2 ? i2 != 3 ? view.getContext().getString(R.string.media_picker_recent_media_album) : view.getContext().getString(R.string.media_picker_video_vk_tab) : view.getContext().getString(R.string.media_picker_photo_vk_tab) : enc0Var.c(enc0Var.Y));
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new f2b0((cno) this.c);
    }

    @Override // ru.ok.gl.tf.Tensorflow.InitializeCallback
    public void onInitialized() {
        com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
        y930 y930Var = bVar.r;
        bVar.O0 = y930Var != null && y930Var.b();
        bVar.R0 = Preference.j().getBoolean("key_morphing_fps_sent", false);
        long a = y930Var != null ? y930Var.a() : 0L;
        L.p("morphingSupport " + bVar.O0 + " morphingFpsSent " + bVar.R0 + " morphingGPUTest " + a);
        long j = Preference.j().getLong("key_gpu_test_time", 0L);
        bVar.U0 = j;
        if (bVar.O0 && j > 0 && a > 0) {
            bVar.O0 = j <= a;
            StringBuilder sb = new StringBuilder("Morphing gpu test ");
            sb.append(bVar.U0);
            L.p(xy6.a(a, " <= ", sb));
        }
        z930 z930Var = bVar.J0;
        if (z930Var != null) {
            z930Var.e = bVar.U0;
        }
        com.vk.media.ok.a aVar = bVar.h;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // xsna.xlj
    public ViewGroup provide() {
        return ((com.vk.photo.editor.features.markup.text.a) this.c).d.getView();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.i) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((hsc0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((t6c0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((uhd) this.c).invoke(obj, obj2);
    }
}
