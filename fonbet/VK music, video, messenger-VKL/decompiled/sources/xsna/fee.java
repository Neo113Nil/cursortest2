package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: ClipsGridScreenContract.kt */
/* loaded from: classes17.dex */
public interface fee {
    void E0(boolean z);

    boolean F0();

    void G0();

    void T1();

    boolean U1();

    void V1(String str);

    boolean W1();

    boolean X1();

    void Y1();

    void Z1(ClipGridParams.Data data);

    UserId a();

    void a2();

    MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b();

    void b2(Context context, ClipGridParams.Data data);

    boolean c();

    void c2(View view, Rect rect, ClipGridParams.Data data, gzs<s3q0> gzsVar);

    void d();

    void d2(ClipGridParams.Data data);

    void e2(boolean z);

    void f2(Context context, ClipGridParams.Data data);

    void g2(ClipGridParams.Data data);

    String getRef();

    void h2(ClipGridParams.Data data, ClipCameraParams clipCameraParams);

    void i2(ClipGridParams.Data.Profile profile);

    void j2(ClipGridParams.Data data);

    void k2(SdkClipAudioTemplate sdkClipAudioTemplate);

    void l2();

    void m2(ClipGridParams.Data.Music music);

    void n2(Context context);

    void o2(Context context, ClipGridParams.Data data);

    void onDestroyView();

    void onPause();

    void onResume();

    void p2(ClipGridParams.Data data);

    void q2();

    void r2();

    void s2();

    boolean t2();

    sde w1(ClipsGridTabData clipsGridTabData);
}
