package xsna;

import com.vkontakte.android.R;

/* compiled from: ReviewBodyData.kt */
/* loaded from: classes18.dex */
public final class dce0 {
    public final String a;

    public dce0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dce0) && epx.f(this.a, ((dce0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.attr.vk_ui_text_secondary) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("PublishInfo(text="), this.a, ", textColor=2130971860)");
    }
}
