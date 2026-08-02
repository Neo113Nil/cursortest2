package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import java.util.ArrayList;

/* compiled from: PaginationDelegateAdapter.kt */
/* loaded from: classes4.dex */
public abstract class td90 implements sd90 {
    public UserId a = UserId.d;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    public VideoStatistic g;
    public boolean h;

    @Override // xsna.sd90
    public final void E(String str) {
        this.c = str;
    }

    @Override // xsna.sd90
    public io.reactivex.rxjava3.core.q<vqt> Q1(String str) {
        return e();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> a(boolean z, boolean z2) {
        return (z && z2) ? l() : e();
    }

    @Override // xsna.sd90
    public int b() {
        return this.f;
    }

    @Override // xsna.sd90
    public final void c(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.sd90
    public final void f(boolean z) {
        this.h = z;
    }

    @Override // xsna.sd90
    public final void j(int i) {
        this.e = i;
    }

    @Override // xsna.sd90
    public final void k(int i) {
        this.b = i;
    }

    @Override // xsna.sd90
    public final void m(VideoStatistic videoStatistic) {
        this.g = videoStatistic;
    }

    @Override // xsna.sd90
    public boolean p() {
        return false;
    }

    @Override // xsna.sd90
    public io.reactivex.rxjava3.core.q r(int i, ArrayList arrayList) {
        return h(i);
    }

    @Override // xsna.sd90
    public final void setTrackCode(String str) {
        this.d = str;
    }

    @Override // xsna.sd90
    public void g() {
    }

    @Override // xsna.sd90
    public void i() {
    }

    @Override // xsna.sd90
    public void o(int i) {
    }
}
