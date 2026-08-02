package xsna;

import android.content.Context;
import com.vk.core.tips.Tooltip;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.media.player.video.view.SimpleVideoView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.fih;
import xsna.ggh;
import xsna.j40;
import xsna.prt;
import xsna.u0i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t7 implements io.reactivex.rxjava3.functions.l, m090, Tooltip.c, io.reactivex.rxjava3.functions.h, wut0, prt.b, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, SimpleVideoView.i {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.m090
    public int a() {
        return ((c37) this.c).x.f;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((n21) this.c).invoke(obj, obj2);
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.i
    public void b() {
        p4g0.setupMaxDuration$lambda$1$lambda$0((p4g0) this.c);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        baf bafVar = (baf) this.c;
        j40 j40Var = bafVar.a;
        j40Var.a = null;
        j40.a poll = j40Var.b.poll();
        if (poll != null) {
            j40Var.a = poll;
            poll.c.invoke();
        }
        bafVar.b = null;
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new u0i.a((Context) this.c);
    }

    @Override // xsna.prt.b
    public List d(ArrayList arrayList) {
        return (List) ((izs) this.c).invoke(arrayList);
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ggh.a) ((zfh) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((qcw) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((o8) obj2).invoke(obj);
            case 1:
                return (Pair) ((e60) obj2).invoke(obj);
            case 2:
            case 9:
            case 10:
            case 13:
            case 14:
            case 19:
            case 22:
            case 25:
            default:
                return (List) ((qcw) obj2).invoke(obj);
            case 3:
                return (s3q0) ((e60) obj2).invoke(obj);
            case 4:
                return (ap9) ((za) obj2).invoke(obj);
            case 5:
                return (List) ((e60) obj2).invoke(obj);
            case 6:
                return (s3q0) ((by5) obj2).invoke(obj);
            case 7:
                return (e8b0) ((q69) obj2).invoke(obj);
            case 8:
                return (List) ((q45) obj2).invoke(obj);
            case 11:
                return (fih.b) ((e60) obj2).invoke(obj);
            case 12:
                return (String) ((e60) obj2).invoke(obj);
            case 15:
                return (JSONObject) ((e60) obj2).invoke(obj);
            case 16:
                return (Boolean) ((e60) obj2).invoke(obj);
            case 17:
                return (kru) ((sm0) obj2).invoke(obj);
            case 18:
                int i2 = ImSettingsDialogThemeFragment.c0;
                return (io.reactivex.rxjava3.core.e) ((qcw) obj2).invoke(obj);
            case 20:
                return (nov) ((x2y) obj2).invoke(obj);
            case 21:
                return (MusicTrack) ((qcw) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((x2y) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((by5) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.q) ((x2y) obj2).c;
            case 27:
                return (Integer) ((qcw) obj2).invoke(obj);
        }
    }
}
