package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.t;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.p.b;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import ru.ok.tensorflow.tflite.GLHandler;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.l8n0;
import xsna.we9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ue9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ue9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean valueOf;
        l8n0 l8n0Var;
        long j;
        switch (this.b) {
            case 0:
                we9 we9Var = (we9) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        TextUtils.join(", ", arrayList2);
                        we9Var.toString();
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((vfq0) it2.next()) instanceof n3d0) {
                                    we9Var.g.h = null;
                                }
                            }
                        }
                        we9Var.k();
                        if (!we9Var.b.b().isEmpty()) {
                            we9Var.y();
                            we9Var.u();
                            if (we9Var.e == we9.e.OPENED) {
                                we9Var.r();
                                return;
                            }
                            return;
                        }
                        we9Var.g.h();
                        we9Var.u();
                        we9Var.g.l(false);
                        we9Var.l = new gs9();
                        we9Var.toString();
                        int i = we9.b.a[we9Var.e.ordinal()];
                        if (i == 2) {
                            obr.f(null, we9Var.j == null);
                            we9Var.v(we9.e.INITIALIZED, true);
                            return;
                        }
                        if (i == 4) {
                            we9Var.v(we9.e.CLOSING, true);
                            we9Var.l(false);
                            return;
                        }
                        if (i != 5 && i != 6) {
                            Objects.toString(we9Var.e);
                            we9Var.toString();
                            return;
                        }
                        boolean a = we9Var.h.a();
                        we9Var.v(we9.e.CLOSING, true);
                        if (a) {
                            obr.f(null, we9Var.p());
                            we9Var.n();
                            return;
                        }
                        return;
                    }
                    vfq0 vfq0Var = (vfq0) it.next();
                    androidx.camera.core.impl.t tVar = we9Var.b;
                    String str = vfq0Var.e() + vfq0Var.hashCode();
                    HashMap hashMap = tVar.a;
                    if (hashMap.containsKey(str) ? ((t.a) hashMap.get(str)).b : false) {
                        we9Var.b.a.remove(vfq0Var.e() + vfq0Var.hashCode());
                        arrayList2.add(vfq0Var);
                    }
                }
                break;
            case 1:
                fl9 fl9Var = (fl9) this.c;
                CameraInternal cameraInternal = (CameraInternal) this.d;
                synchronized (fl9Var.a) {
                    try {
                        fl9Var.c.remove(cameraInternal);
                        if (fl9Var.c.isEmpty()) {
                            fl9Var.e.getClass();
                            fl9Var.e.b(null);
                            fl9Var.e = null;
                            fl9Var.d = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                GLHandler.lambda$runTaskSync$0((Runnable) this.c, (ConditionLock) this.d);
                return;
            case 3:
                QuestionsListFragment questionsListFragment = (QuestionsListFragment) this.c;
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) this.d;
                int i2 = QuestionsListFragment.f0;
                QuestionsListFragment.mo(SchemeStat$TypeQuestionItem.Type.OPEN_PROFILE, dVar.b());
                questionsListFragment.ko(dVar.a().s1());
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) this.d;
                l8n0 l8n0Var2 = (l8n0) this.c;
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    l8n0.a aVar = (l8n0.a) it3.next();
                    RecyclerView.e0 e0Var = aVar.a;
                    if (e0Var != null) {
                        valueOf = Boolean.valueOf(l8n0.J(e0Var));
                    } else {
                        RecyclerView.e0 e0Var2 = aVar.b;
                        valueOf = e0Var2 != null ? Boolean.valueOf(l8n0.J(e0Var2)) : null;
                    }
                    if (epx.f(valueOf, Boolean.TRUE)) {
                        long j2 = l8n0Var2.s;
                        ArrayList<RecyclerView.e0> arrayList4 = l8n0Var2.r;
                        RecyclerView.e0 e0Var3 = aVar.a;
                        RecyclerView.e0 e0Var4 = aVar.b;
                        RecyclerView.e0 e0Var5 = e0Var4 == null ? e0Var3 : e0Var4;
                        if (e0Var5 == null || l8n0.I(e0Var5, aVar.c, aVar.d, aVar.e, aVar.f)) {
                            if (e0Var3 != null) {
                                View view = e0Var3.itemView;
                                j = 2;
                                ViewPropertyAnimator duration = view.animate().setDuration(j2 / 2);
                                arrayList4.add(e0Var3);
                                l8n0Var = l8n0Var2;
                                duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setStartDelay(0L).setListener(new o8n0(l8n0Var, aVar, duration, view)).start();
                            } else {
                                l8n0Var = l8n0Var2;
                                j = 2;
                            }
                            if (e0Var4 != null) {
                                View view2 = e0Var4.itemView;
                                ViewPropertyAnimator animate = view2.animate();
                                arrayList4.add(e0Var4);
                                long j3 = j2 / j;
                                animate.setDuration(j3).setStartDelay(j3).alpha(1.0f).setListener(new p8n0(l8n0Var, aVar, animate, view2)).start();
                            }
                        } else {
                            l8n0Var2.C(aVar);
                            l8n0Var = l8n0Var2;
                        }
                        l8n0Var2 = l8n0Var;
                    } else {
                        l8n0Var2.C(aVar);
                    }
                }
                arrayList3.clear();
                l8n0Var2.n.remove(arrayList3);
                return;
            case 5:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                com.vk.attachpicker.screen.m mVar = new com.vk.attachpicker.screen.m(((MediaStoreEntry) this.d).f(), pVar.M, pVar.N, pVar.O, pVar.new b(), pVar.U);
                pVar.S.u(pVar.z);
                ScreenContainer screenContainer = pVar.f;
                if (screenContainer != null) {
                    screenContainer.d(mVar);
                }
                pVar.b.postDelayed(new ls2(10, pVar, mVar), 300L);
                return;
            case 6:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.a) this.c).b((com.mbridge.msdk.config.component.info.provider.listener.a) this.d);
                return;
            default:
                ((yads.fl2) this.c).b((yads.zx2) this.d);
                return;
        }
    }

    public /* synthetic */ ue9(ArrayList arrayList, l8n0 l8n0Var) {
        this.b = 4;
        this.d = arrayList;
        this.c = l8n0Var;
    }
}
