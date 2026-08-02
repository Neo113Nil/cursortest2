package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelStubAttachesReporterImpl.kt */
/* loaded from: classes5.dex */
public final class cdb extends wn6<ChannelStubAttachesReporter.Span, Object> implements ChannelStubAttachesReporter {
    public final HashMap<Integer, mdz<ChannelStubAttachesReporter.Span>> i;

    public cdb(String str) {
        super(str);
        this.i = new HashMap<>();
    }

    @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
    public final void a() {
        this.i.clear();
    }

    @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
    public final void j(int i) {
        this.i.remove(Integer.valueOf(i));
    }

    @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
    public final void o(MsgFromChannel msgFromChannel) {
        if (msgFromChannel.g8()) {
            List<Attach> list = msgFromChannel.E;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Attach) it.next()) instanceof AttachChannelStub) {
                        z = true;
                        break;
                    }
                }
            }
            int i = msgFromChannel.I.d;
            Integer valueOf = Integer.valueOf(i);
            HashMap<Integer, mdz<ChannelStubAttachesReporter.Span>> hashMap = this.i;
            mdz<ChannelStubAttachesReporter.Span> mdzVar = hashMap.get(valueOf);
            if (z && mdzVar == null) {
                mdz<ChannelStubAttachesReporter.Span> mdzVar2 = new mdz<>(i, ChannelStubAttachesReporter.Span.ATTACH_STUB_LOAD, null);
                c(mdzVar2);
                hashMap.put(Integer.valueOf(i), mdzVar2);
            } else {
                if (z || mdzVar == null) {
                    return;
                }
                hashMap.remove(Integer.valueOf(i));
                f(mdzVar, null);
            }
        }
    }

    @Override // xsna.wn6
    public final void t(mdz<ChannelStubAttachesReporter.Span> mdzVar, Object obj) {
        wn6.w(this, mdzVar, new ol(8), null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }
}
