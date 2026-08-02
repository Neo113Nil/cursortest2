package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlbumViewState.kt */
/* loaded from: classes7.dex */
public final class rl1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final Object e;
    public final List f;
    public final int g;
    public final int h;
    public final List i;

    public rl1(boolean z, boolean z2, String str, boolean z3, VideoAlbumData videoAlbumData, List list, int i, int i2, ArrayList arrayList) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = videoAlbumData;
        this.f = list;
        this.g = i;
        this.h = i2;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        boolean f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl1)) {
            return false;
        }
        rl1 rl1Var = (rl1) obj;
        if (this.a != rl1Var.a || this.b != rl1Var.b || !epx.f(this.c, rl1Var.c) || this.d != rl1Var.d || !epx.f(this.e, rl1Var.e) || !epx.f(this.f, rl1Var.f) || this.g != rl1Var.g || this.h != rl1Var.h) {
            return false;
        }
        List list = rl1Var.i;
        List list2 = this.i;
        if (list2 == null) {
            if (list == null) {
                f = true;
            }
            f = false;
        } else {
            if (list != null) {
                f = epx.f(list2, list);
            }
            f = false;
        }
        return f;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Object obj = this.e;
        int a = shy.a(this.h, shy.a(this.g, fw3.a((b + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.f), 31), 31);
        List list = this.i;
        return a + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumViewState(isEnabled=");
        sb.append(this.a);
        sb.append(", isChecked=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", isPrivateIconShown=");
        sb.append(this.d);
        sb.append(", payload=");
        sb.append(this.e);
        sb.append(", images=");
        mr.c(", updatedTime=", sb, this.f);
        sb.append(this.g);
        sb.append(", videosCount=");
        sb.append(this.h);
        sb.append(", privacy=");
        List list = this.i;
        return tq.f(sb, list == null ? "null" : wow.c(list), ')');
    }
}
