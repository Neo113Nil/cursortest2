package ru.ok.android.webrtc.animoji.stats;

import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.rty0;

/* loaded from: classes9.dex */
public final class AnimojiStatCollector implements AnimojiStatHandle {
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);
    public volatile Boolean g = Boolean.FALSE;
    public volatile String h = "";
    public final AtomicInteger i = new AtomicInteger(0);
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public final rty0 a(CallParticipant.ParticipantId participantId) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.j;
        Object obj = concurrentHashMap.get(participantId);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(participantId, (obj = new rty0()))) != null) {
            obj = putIfAbsent;
        }
        return (rty0) obj;
    }

    public final AnimojiStat createStat() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.j.entrySet()) {
            Object key = entry.getKey();
            rty0 rty0Var = (rty0) entry.getValue();
            hashMap.put(key, new AnimojiParticipantStat(rty0Var.a.get(), rty0Var.b.get(), rty0Var.c.get(), rty0Var.d.get(), rty0Var.e));
        }
        int i = this.a.get();
        int i2 = this.b.get();
        int i3 = this.c.get();
        int i4 = this.d.get();
        int i5 = this.e.get();
        int i6 = this.f.get();
        Boolean bool = this.g;
        return new AnimojiStat(i, i2, i3, i4, i5, i6, bool != null ? bool.booleanValue() : false, this.h, this.i.get(), hashMap);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onDispatchBgColor(CallParticipant.ParticipantId participantId) {
        a(participantId).b.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onDispatchFrame(CallParticipant.ParticipantId participantId) {
        a(participantId).a.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onDispatchLandmarks(CallParticipant.ParticipantId participantId) {
        a(participantId).c.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onLandmarksSenderCreated() {
        this.a.set(0);
        this.b.set(0);
        this.c.set(0);
        this.d.set(0);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onMlLandmarks() {
        this.i.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onMlParams(Boolean bool, String str) {
        this.g = bool;
        this.h = str;
        this.i.set(0);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onReceiverBytesReceived(int i) {
        this.e.addAndGet(i);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onReceiverCreated() {
        this.e.set(0);
        this.f.set(0);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onReceiverPackageReceived() {
        this.f.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onRenderFrameDrawn(CallParticipant.ParticipantId participantId) {
        a(participantId).d.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onRenderResolutionChanged(CallParticipant.ParticipantId participantId, int i, int i2) {
        a(participantId).e = new Size(i, i2);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onSenderBytesSend(int i) {
        this.a.addAndGet(i);
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onSenderPackageDropped() {
        this.c.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onSenderPackageQueued() {
        this.d.incrementAndGet();
    }

    @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
    public void onSenderPackageSent() {
        this.b.incrementAndGet();
    }
}
