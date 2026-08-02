package xsna;

import com.vk.core.preference.Preference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsAutoScrollPrefsImpl.kt */
/* loaded from: classes17.dex */
public final class yid implements xid {
    public static final /* synthetic */ qcy<Object>[] c = {new MutablePropertyReference1Impl(yid.class, "enabled", "getEnabled()Z", 0), p5j.a(0, yid.class, "timestamp", "getTimestamp()J", fpf0.a)};
    public final f18 a = new f18("VkVideoBridge", "auto_scroll_enabled", false);
    public final hn70 b = new hn70("VkVideoBridge", "auto_scroll_timestamp", 0);

    @Override // xsna.xid
    public final void clear() {
        Preference.C("VkVideoBridge", "auto_scroll_enabled");
        Preference.C("VkVideoBridge", "auto_scroll_timestamp");
    }

    @Override // xsna.xid
    public final boolean getEnabled() {
        qcy<Object> qcyVar = c[0];
        return this.a.a().booleanValue();
    }

    @Override // xsna.xid
    public final long getTimestamp() {
        qcy<Object> qcyVar = c[1];
        return this.b.a().longValue();
    }

    @Override // xsna.xid
    public final void setEnabled(boolean z) {
        qcy<Object> qcyVar = c[0];
        this.a.b(z);
    }

    @Override // xsna.xid
    public final void setTimestamp(long j) {
        qcy<Object> qcyVar = c[1];
        this.b.b(j);
    }
}
