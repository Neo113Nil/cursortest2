package xsna;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.auth.ui.password.askpassword.VkAskPasswordActivity;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.core.preference.Preference;
import com.vk.im.ui.views.RichEditText;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.PagerSlidingTabStripBase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;
import xsna.pk9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qb3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qb3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.b) {
            case 0:
                Application application = (Application) this.c;
                synchronized (zge0.a) {
                    try {
                        file = new File(application.getFilesDir(), "push-analytics");
                    } catch (IOException e) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{"[push]", "Failed to send analytics — " + e.getMessage()});
                        }
                    } catch (SecurityException e2) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.e, new Object[]{"[push]", "Failed to send analytics — " + e2.getMessage()});
                        }
                    }
                    if (file.exists()) {
                        File file2 = new File(file, "events.jsonl");
                        File file3 = new File(file, "sending.jsonl");
                        if (file2.exists() && !file2.renameTo(file3)) {
                            L l3 = L.a;
                            l3.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l3, L.LogType.e, new Object[]{"[push]", "Failed to rename events.jsonl for sending"});
                            }
                            return;
                        }
                        if (file3.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            zge0.a(file3, linkedHashMap);
                            if (!file3.delete()) {
                                L l4 = L.a;
                                l4.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l4, L.LogType.e, new Object[]{"[push]", "Failed to delete sending.jsonl after flush"});
                                }
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                zge0.b((String) entry.getKey(), (xge0) entry.getValue());
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((CallsBluetoothManager) this.c).bluetoothTimeout();
                return;
            case 2:
                pk9.b bVar = ((ok9) this.c).e;
                if (bVar != null) {
                    bVar.d();
                    return;
                }
                return;
            case 3:
                RichEditText richEditText = ((com.vk.channels.impl.channel_screen.send_msg.a) this.c).B;
                mhy.j(richEditText != null ? richEditText : null);
                return;
            case 4:
                ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh = (ClipsMusicSelectorCatalogEmbeddedTabsVh) this.c;
                qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
                clipsMusicSelectorCatalogEmbeddedTabsVh.b();
                return;
            case 5:
                lto.b7((lto) this.c);
                return;
            case 6:
                ListGroupCallView listGroupCallView = (ListGroupCallView) this.c;
                listGroupCallView.F.setContentDescription(listGroupCallView.getContext().getString(R.string.voip_accessibility_hide_participants_feed));
                return;
            case 7:
                fr50 fr50Var = (fr50) this.c;
                ValueAnimator valueAnimator = fr50Var.M;
                boolean z = valueAnimator != null && valueAnimator.isRunning();
                FrameLayout frameLayout = fr50Var.E;
                if (z) {
                    return;
                }
                int i = fr50Var.L;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = frameLayout.getMeasuredHeight();
                if (measuredHeight <= fr50Var.L) {
                    return;
                }
                ValueAnimator valueAnimator2 = fr50Var.M;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(i, measuredHeight);
                    ofInt.addListener(new gr50());
                    ofInt.addUpdateListener(new hr50(fr50Var));
                    ofInt.addListener(new ir50(fr50Var, measuredHeight));
                    ofInt.setDuration(250L);
                    ofInt.start();
                    fr50Var.M = ofInt;
                    return;
                }
                return;
            case 8:
                m780 m780Var = (m780) this.c;
                m780Var.getClass();
                z2s0.b.getClass();
                if (z2s0.j == null) {
                    m780Var.c.j(28);
                    m780Var.e.q0();
                    return;
                }
                return;
            case 9:
                PagerSlidingTabStripBase pagerSlidingTabStripBase = (PagerSlidingTabStripBase) this.c;
                if (pagerSlidingTabStripBase.f != null) {
                    pagerSlidingTabStripBase.f();
                    return;
                }
                return;
            case 10:
                ((y0a0) this.c).a();
                return;
            case 11:
                androidx.room.o oVar = (androidx.room.o) this.c;
                boolean z2 = oVar.c > 0;
                if (oVar.o.compareAndSet(false, true) && z2) {
                    hpj hpjVar = oVar.l.b;
                    if (hpjVar == null) {
                        hpjVar = null;
                    }
                    myc0.h(hpjVar, oVar.r, null, new emg0(oVar, null), 2);
                    return;
                }
                return;
            case 12:
                String str = ((kbl0) this.c).a;
                SharedPreferences f = Preference.f(str);
                ArrayList arrayList = new ArrayList();
                Preference.Type type = Preference.Type.Boolean;
                Boolean bool = Boolean.TRUE;
                Preference.a.getClass();
                arrayList.add(Preference.c(f, type, str, "suggests_enabled", bool));
                arrayList.add(Preference.c(f, type, str, "animation_enabled", bool));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Preference.f) it.next()).a();
                }
                return;
            case 13:
                Reef m = ((hwl0) this.c).m();
                if (m != null) {
                    m.a(new ReefEvent.k());
                    return;
                }
                return;
            case 14:
                kzl0 kzl0Var = (kzl0) this.c;
                int i2 = StoryBottomViewGroup.P;
                kzl0Var.invoke();
                return;
            case 15:
                ((umm0) this.c).c(true);
                return;
            case 16:
                VideoView.setProductBadgeMargins$lambda$132((VideoView) this.c);
                return;
            case 17:
                grt0 grt0Var = (grt0) this.c;
                grt0Var.s = true;
                SimpleVideoView simpleVideoView = grt0Var.r;
                if (simpleVideoView != null) {
                    bwt0.p0(simpleVideoView, !grt0Var.u);
                }
                bwt0.p0(grt0Var.l, grt0Var.u);
                return;
            case 18:
                ((we0) this.c).invoke();
                return;
            case 19:
                VkAskPasswordActivity.d2((VkAskPasswordActivity) this.c);
                return;
            case 20:
                com.vungle.ads.internal.executor.j.b((com.vungle.ads.internal.executor.j) this.c);
                return;
            default:
                yads.xd2.a((yads.xd2) this.c);
                return;
        }
    }
}
