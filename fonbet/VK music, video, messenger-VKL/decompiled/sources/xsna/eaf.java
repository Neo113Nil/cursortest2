package xsna;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsTooltipsPrefsImpl.kt */
/* loaded from: classes17.dex */
public final class eaf implements daf {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(eaf.class, "showStorySharingTooltip", "getShowStorySharingTooltip()Z", 0), p5j.a(0, eaf.class, "clipsAuthorEditorTooltipShown", "getClipsAuthorEditorTooltipShown()Z", fpf0.a), new MutablePropertyReference1Impl(eaf.class, "clipsAuthorChannelEditorTooltipShown", "getClipsAuthorChannelEditorTooltipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsInvolvementOnlineBookingTipShown", "getClipsInvolvementOnlineBookingTipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsInvolvementMessageToBcTipShown", "getClipsInvolvementMessageToBcTipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsInvolvementOpenChannelTipShown", "getClipsInvolvementOpenChannelTipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsEasyPromoteTooltipShown", "getClipsEasyPromoteTooltipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsEasyPromoteFromClipTooltipShown", "getClipsEasyPromoteFromClipTooltipShown()Z", 0), new MutablePropertyReference1Impl(eaf.class, "clipsRedirectTooltipClosed", "getClipsRedirectTooltipClosed()Z", 0)};
    public final f18 a = new f18("VkVideoBridge", "VkVideoBridge.clips_editor_authors_tooltip_shown", false);
    public final f18 b;
    public final f18 c;
    public final f18 d;
    public final f18 e;
    public final f18 f;
    public final f18 g;

    public eaf() {
        new f18("VkVideoBridge", "VkVideoBridge.clips_author_channel_editor_tooltip_shown", false);
        this.b = new f18("VkVideoBridge", "VkVideoBridge.involvement_online_booking_tip_shown", false);
        this.c = new f18("VkVideoBridge", "VkVideoBridge.involvement_message_to_bc_tip_shown", false);
        this.d = new f18("VkVideoBridge", "VkVideoBridge.involvement_open_channel_tip_shown", false);
        this.e = new f18("VkVideoBridge", "VkVideoBridge.clips_editor_easy_promote_tooltip_shown", false);
        this.f = new f18("VkVideoBridge", "VkVideoBridge.clips_easy_promote_tooltip_shown", false);
        this.g = new f18("VkVideoBridge", "VkVideoBridge.clips_redirect_tooltip_closed", false);
    }

    @Override // xsna.daf
    public final void a() {
        qcy<Object> qcyVar = h[6];
        this.e.b(true);
    }

    @Override // xsna.daf
    public final void b() {
        qcy<Object> qcyVar = h[4];
        this.c.b(true);
    }

    @Override // xsna.daf
    public final boolean c() {
        qcy<Object> qcyVar = h[8];
        return this.g.a().booleanValue();
    }

    @Override // xsna.daf
    public final boolean d() {
        qcy<Object> qcyVar = h[7];
        return this.f.a().booleanValue();
    }

    @Override // xsna.daf
    public final boolean e() {
        qcy<Object> qcyVar = h[4];
        return this.c.a().booleanValue();
    }

    @Override // xsna.daf
    public final void f() {
        qcy<Object> qcyVar = h[7];
        this.f.b(true);
    }

    @Override // xsna.daf
    public final boolean g() {
        qcy<Object> qcyVar = h[3];
        return this.b.a().booleanValue();
    }

    @Override // xsna.daf
    public final void h() {
        qcy<Object> qcyVar = h[8];
        this.g.b(true);
    }

    @Override // xsna.daf
    public final void i() {
        qcy<Object> qcyVar = h[5];
        this.d.b(true);
    }

    @Override // xsna.daf
    public final void j() {
        qcy<Object> qcyVar = h[3];
        this.b.b(true);
    }

    @Override // xsna.daf
    public final boolean k() {
        qcy<Object> qcyVar = h[5];
        return this.d.a().booleanValue();
    }

    @Override // xsna.daf
    public final boolean l() {
        qcy<Object> qcyVar = h[6];
        return this.e.a().booleanValue();
    }
}
