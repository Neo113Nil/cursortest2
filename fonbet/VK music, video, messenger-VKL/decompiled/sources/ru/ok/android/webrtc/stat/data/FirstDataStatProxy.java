package ru.ok.android.webrtc.stat.data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class FirstDataStatProxy implements FirstDataStat {
    public final List a;

    public FirstDataStatProxy(List<? extends FirstDataStat> list) {
        this.a = list;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public boolean isReported() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((FirstDataStat) it.next()).isReported()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onAnyOtherAccept() {
        if (isReported()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((FirstDataStat) it.next()).onAnyOtherAccept();
        }
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onFirstData() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((FirstDataStat) it.next()).onFirstData();
        }
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onMeAccepted() {
        if (isReported()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((FirstDataStat) it.next()).onMeAccepted();
        }
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onSignalingConnected() {
        if (isReported()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((FirstDataStat) it.next()).onSignalingConnected();
        }
    }
}
