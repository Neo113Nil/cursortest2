package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.music.attach.AttachMusicActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t24;

/* compiled from: AttachMusicTopBarController.kt */
/* loaded from: classes3.dex */
public final class x24 {
    public final AttachMusicActivity a;
    public final VkTopBar b;
    public t24.e d;
    public t24.e e;
    public t24.e f;
    public int h;
    public boolean i;
    public boolean j;
    public final ArrayList c = new ArrayList();
    public String g = "";

    /* compiled from: AttachMusicTopBarController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            t24.e eVar = ((x24) this.receiver).e;
            if (eVar != null) {
                eVar.onClick();
            }
            return s3q0.a;
        }
    }

    public x24(AttachMusicActivity attachMusicActivity, VkTopBar vkTopBar) {
        this.a = attachMusicActivity;
        this.b = vkTopBar;
    }

    public final void a() {
        x24 x24Var;
        VkTopBar.Middle.d.b.C0874b c0874b;
        int i = this.h;
        AttachMusicActivity attachMusicActivity = this.a;
        String string = i == 0 ? "" : attachMusicActivity.getString(i);
        String str = this.g;
        int length = str.length();
        tho0 tho0Var = new tho0(str, jgz.c(length, length), 4);
        boolean z = this.i;
        if (this.j) {
            x24Var = this;
            c0874b = new VkTopBar.Middle.d.b.C0874b(attachMusicActivity.getString(R.string.accessibility_search), new a(0, this, x24.class, "onRightButtonClick", "onRightButtonClick()V", 0));
        } else {
            x24Var = this;
            c0874b = null;
        }
        x24Var.b.setMiddle(new VkTopBar.Middle.d(string, tho0Var, z, new com.vk.movika.sdk.base.observable.p(this, 9), new com.vk.movika.sdk.base.observable.q(this, 6), new defpackage.h(this, 3), null, null, c0874b, null, 3776));
    }
}
