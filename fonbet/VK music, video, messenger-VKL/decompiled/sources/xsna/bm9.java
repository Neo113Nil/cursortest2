package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.im.MsgType;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.media.ok.utils.DuetAction;
import com.vk.storycamera.builder.StoryCameraParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import xsna.rl9;

/* compiled from: CameraUI.kt */
/* loaded from: classes16.dex */
public interface bm9 extends qk6<cm9>, di9, liz, di10, oe8, ShutterButton.e, rl9.c {

    /* compiled from: CameraUI.kt */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ClickMetaInfo(isGestureDetect=true, countedDown="), this.a, ')');
        }
    }

    StoryCameraParams A0();

    void A3(boolean z, boolean z2);

    void A4();

    void B3();

    zm9 B4();

    int C3();

    void C4();

    void D3(int i);

    void E3();

    void F3(int i);

    void G2(String str);

    int G3(int i);

    void H3();

    StoryCameraMode I3(int i);

    boolean J3();

    am9 K3();

    void L3(boolean z);

    boolean M3();

    void N3(boolean z);

    void O3(MsgType msgType);

    void P3(boolean z, boolean z2);

    boolean Q3();

    void R3();

    int S3();

    void T3();

    boolean U3();

    int V3();

    void W3();

    void X3();

    boolean Y3();

    wm9 Z3();

    void a(Mask mask);

    void a4(StoryCameraMode storyCameraMode);

    void b(boolean z);

    void b4();

    void c(float f);

    StoryCameraMode c4();

    void clearSavedStorage();

    void d(Mask mask);

    void d4(boolean z);

    void e(ArrayList<Long> arrayList);

    boolean e4();

    boolean f4();

    void g4();

    StoryCameraParams getCurCameraParams();

    an9 getState();

    void h3(Bundle bundle);

    void h4();

    void i3(boolean z);

    void i4();

    void j3();

    void j4(float f, int i, int i2);

    void k3(boolean z);

    void k4();

    void l3(int i);

    void l4();

    void m3(MusicCameraData musicCameraData);

    void m4();

    void n3();

    void n4();

    boolean o3();

    void o4();

    ArrayList p3(Map map);

    int p4(int i, HashMap hashMap, LinkedList linkedList);

    boolean q3();

    void q4();

    void r3(a aVar);

    void r4();

    void s3();

    void t3(boolean z);

    void t4(boolean z, boolean z2);

    void u3();

    void u4();

    void v1(String str, String str2);

    boolean v3();

    void v4();

    View w1(Context context);

    void w3();

    void w4(lno lnoVar, DuetAction duetAction);

    void x3();

    void x4(StoryMusicInfo storyMusicInfo);

    void y3(DuetAction duetAction);

    boolean y4();

    List<StoryCameraMode> z3();

    void z4(boolean z);
}
