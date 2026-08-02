package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.performance;

import defpackage.cnr0;
import defpackage.syg;
import defpackage.uva0;
import defpackage.uyg;
import defpackage.uyi0;
import defpackage.xez0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/performance/DecodingVelocityMonitoringImpl;", "Luyg;", "Luyi0;", "renderingEventsListener", "<init>", "(Luyi0;)V", "", "name", "logID", "Lzy11;", "startDecodingDocument", "(Ljava/lang/String;Ljava/lang/String;)V", "", "documentSizeByte", "pageToken", "endDecodingDocument", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "duration", "logJsonCreationTimings", "(Ljava/lang/String;J)V", "logDecodingSharedDataSlice", "startDecodingSection", "endDecodingSection", "Luyi0;", "Ljava/util/concurrent/ConcurrentHashMap;", "decodingStartTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodingVelocityMonitoringImpl implements uyg {
    private final ConcurrentHashMap<String, Long> decodingStartTimes = new ConcurrentHashMap<>();
    private final uyi0 renderingEventsListener;

    public DecodingVelocityMonitoringImpl(uyi0 uyi0Var) {
        this.renderingEventsListener = uyi0Var;
    }

    @Override // defpackage.uyg
    public /* bridge */ /* synthetic */ void clearNetworkPageInfo(String str) {
    }

    @Override // defpackage.uyg
    public void endDecodingDocument(String name, long documentSizeByte, String pageToken, String logID) {
        Long remove = this.decodingStartTimes.remove(name);
        if (remove != null) {
            long nanoTime = (System.nanoTime() - remove.longValue()) / 1000000;
            uyi0 uyi0Var = this.renderingEventsListener;
            if (uyi0Var != null) {
                ((uva0) uyi0Var).b(nanoTime, documentSizeByte, name);
            }
        }
    }

    @Override // defpackage.uyg
    public void endDecodingSection(String str, String str2, String str3, Map map) {
        endDecodingSection(str, str2);
    }

    @Override // defpackage.l631
    public Map getVelocityContext(cnr0 cnr0Var) {
        return b.f();
    }

    @Override // defpackage.uyg
    public void logDecodingSharedDataSlice(String str, String str2, xez0 xez0Var, Map map) {
        logDecodingSharedDataSlice(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.uyg
    public void logJsonCreationTimings(String str, String str2, xez0 xez0Var, Map map) {
        logJsonCreationTimings(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.uyg
    public void startDecodingDocument(String name, String logID) {
        this.decodingStartTimes.put(name, Long.valueOf(System.nanoTime()));
    }

    @Override // defpackage.uyg
    public void startDecodingSection(String name, String logID) {
    }

    @Override // defpackage.uyg
    public void endDecodingSection(String name, String logID) {
    }

    @Override // defpackage.uyg
    public void logDecodingSharedDataSlice(String name, long duration) {
    }

    @Override // defpackage.uyg
    public void logJsonCreationTimings(String name, long duration) {
    }

    @Override // defpackage.uyg
    public void endDecodingDocument(String str, syg sygVar, String str2) {
        endDecodingDocument(str, sygVar.a, sygVar.b, str2);
    }
}
