package xsna;

import com.vk.dto.common.Source;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: ChannelReactionsMappingsUpdateJob.kt */
/* loaded from: classes.dex */
public final class zab extends u4w {

    /* compiled from: ChannelReactionsMappingsUpdateJob.kt */
    public static final class a implements s7x<zab> {
        @Override // xsna.s7x
        public final zab a(ny90 ny90Var) {
            return new zab();
        }

        @Override // xsna.s7x
        public final /* bridge */ /* synthetic */ void b(zab zabVar, ny90 ny90Var) {
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelReactionsMappingsUpdateJob";
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        w2wVar.L0(this, new pza(Source.ACTUAL));
        w2wVar.e1(this, new p280());
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "im-channel-reaction-mappings-update";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelReactionsMappingsUpdateJob";
    }
}
