package xsna;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;

/* compiled from: ClipsTemplateEditorContract.kt */
/* loaded from: classes16.dex */
public interface j6f {
    void a0();

    void d(View view, MotionEvent motionEvent);

    void g();

    void j();

    void k();

    void l();

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void p(ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel);

    void t();

    void u(int i);

    void v();

    void x();
}
