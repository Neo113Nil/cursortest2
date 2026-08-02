package xsna;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: ForwardingTrackSelection.java */
/* loaded from: classes12.dex */
public class gas implements d7q {
    public final d7q a;

    public gas(d7q d7qVar) {
        this.a = d7qVar;
    }

    @Override // xsna.d7q
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // xsna.wgp0
    public int b(androidx.media3.common.a aVar) {
        return this.a.b(aVar);
    }

    @Override // xsna.d7q
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // xsna.d7q
    public final boolean d(int i, long j) {
        return this.a.d(i, j);
    }

    @Override // xsna.d7q
    public final void disable() {
        this.a.disable();
    }

    @Override // xsna.d7q
    public final void e() {
        this.a.e();
    }

    @Override // xsna.d7q
    public final void enable() {
        this.a.enable();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gas) {
            return this.a.equals(((gas) obj).a);
        }
        return false;
    }

    @Override // xsna.d7q
    public final int evaluateQueueSize(long j, List<? extends aq10> list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // xsna.d7q
    public final void f() {
        this.a.f();
    }

    @Override // xsna.d7q
    public final void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
        this.a.g(j, j2, j3, list, bq10VarArr);
    }

    @Override // xsna.wgp0
    public androidx.media3.common.a getFormat(int i) {
        return this.a.getFormat(i);
    }

    @Override // xsna.wgp0
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // xsna.d7q
    public androidx.media3.common.a getSelectedFormat() {
        return this.a.getSelectedFormat();
    }

    @Override // xsna.d7q
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // xsna.d7q
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // xsna.d7q
    @Nullable
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // xsna.d7q
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // xsna.wgp0
    public pfp0 getTrackGroup() {
        return this.a.getTrackGroup();
    }

    @Override // xsna.d7q
    public final boolean h(long j, ccc cccVar, List<? extends aq10> list) {
        return this.a.h(j, cccVar, list);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.wgp0
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }

    @Override // xsna.wgp0
    public final int length() {
        return this.a.length();
    }

    @Override // xsna.d7q
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }
}
