package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.impl.a;
import com.vk.core.preference.Preference;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.e8j0;
import xsna.q1m0;

/* compiled from: StoryEditorProviderImpl.kt */
/* loaded from: classes16.dex */
public final class t1m0 implements q1m0 {
    public final ei9 a;

    public t1m0(ei9 ei9Var) {
        this.a = ei9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e2  */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, xsna.u440, xsna.u76] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.view.View, xsna.u86] */
    @Override // xsna.q1m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p5p a(l7s l7sVar, ViewGroup viewGroup, di9 di9Var, m1m0 m1m0Var) {
        di9 di9Var2;
        v76 v76Var;
        boolean z;
        boolean z2;
        z4p z4pVar;
        z4p z4pVar2;
        z4p z4pVar3;
        String str;
        long j;
        long j2;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? y440Var = new y440(bwt0.u(l7sVar), this.a, new j96(l7sVar, new x1e0(l7sVar, 10), this.a, new ke90(ref$ObjectRef, 1), new z4d0(ref$ObjectRef2, 13), new wp40(ref$ObjectRef2, 28)), new u48(l7sVar));
        y440Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (m1m0Var.g && viewGroup != 0) {
            viewGroup.setBackgroundColor(-16777216);
        }
        if (viewGroup != 0) {
            viewGroup.addView(y440Var);
        }
        ref$ObjectRef2.element = y440Var;
        ?? u440Var = new u440(m1m0Var.d.j() ? CameraEditorContentType.STORY : CameraEditorContentType.MEDIA, m1m0Var.e, m1m0Var.b, m1m0Var.c, new ArrayList((List) m1m0Var.a), di9Var, (g440) ref$ObjectRef2.element);
        ref$ObjectRef.element = u440Var;
        ((y440) ref$ObjectRef2.element).setPresenter((u76) u440Var);
        u440 u440Var2 = (u440) ref$ObjectRef.element;
        StoryEditorMode storyEditorMode = m1m0Var.f;
        ArrayList arrayList = u440Var2.v;
        di9 di9Var3 = u440Var2.j;
        CommonUploadParams commonUploadParams = u440Var2.k;
        u440Var2.h = storyEditorMode;
        v76 v76Var2 = u440Var2.s;
        v76Var2.Oa(storyEditorMode);
        u440Var2.t = v76Var2.getSideControlPanel();
        q3p bottomControlPanel = v76Var2.getBottomControlPanel();
        u440Var2.u = bottomControlPanel;
        if (bottomControlPanel != null) {
            bottomControlPanel.setIsMultiStories(arrayList.size() > 1);
        }
        if (u440Var2.w != CameraEditorContentType.STORY || u440Var2.L) {
            di9Var2 = di9Var3;
            v76Var = v76Var2;
            z = false;
        } else {
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            Features.Type type = Features.Type.FEATURE_STORY_EDITOR_CONTROLS_TIPS;
            if (bVar.a(type)) {
                b.d i = bVar.i(type);
                JSONObject g = i != null ? i.g() : null;
                r0m0 r0m0Var = g != null ? new r0m0(g.optInt("show_times", 3), g.optInt("reset_editor", 0), TimeUnit.DAYS.toMillis(g.optInt("days_delay", 14)), 1000 * g.optInt("show_sec", 5)) : new r0m0(3, 0, TimeUnit.DAYS.toMillis(14L), 5000L);
                xuo0.a.getClass();
                long a = xuo0.a();
                long m = Preference.m(0L, "story_controls_tips_pref", "story_reset_editor_tips");
                long j3 = r0m0Var.d;
                di9Var2 = di9Var3;
                if (j3 > m) {
                    v76Var = v76Var2;
                    Preference.F(0L, "story_controls_tips_pref", "story_editor_tips_seen_times");
                    Preference.F(j3, "story_controls_tips_pref", "story_reset_editor_tips");
                } else {
                    v76Var = v76Var2;
                    if (a - Preference.m(0L, "story_controls_tips_pref", "story_editor_entered_last_time") > r0m0Var.b) {
                        Preference.F(0L, "story_controls_tips_pref", "story_editor_tips_seen_times");
                    } else if (Preference.m(0L, "story_controls_tips_pref", "story_editor_tips_seen_times") >= r0m0Var.a) {
                        j = 0;
                        Preference.F(xuo0.a(), "story_controls_tips_pref", "story_editor_entered_last_time");
                        j2 = 0;
                    }
                }
                j = r0m0Var.c;
                Preference.F(xuo0.a(), "story_controls_tips_pref", "story_editor_entered_last_time");
                j2 = 0;
            } else {
                di9Var2 = di9Var3;
                v76Var = v76Var2;
                j = 0;
                j2 = 0;
            }
            if (j != j2) {
                z4p z4pVar4 = u440Var2.t;
                if (z4pVar4 != null) {
                    z4pVar4.a(j);
                }
                z = true;
            } else {
                z = false;
            }
            u440Var2.L = true;
        }
        int i2 = 2;
        u440Var2.o.r.b.p(epx.f(commonUploadParams.e, UserId.d) && di9Var2.x().d(), false, null, new lv2(u440Var2, z, i2));
        v76Var.z6();
        u440Var2.setEditorTouchesEnabled(true);
        u440Var2.D7().p(u440Var2.b5());
        z4p z4pVar5 = u440Var2.t;
        if (z4pVar5 != null) {
            z4pVar5.setTextStickerVisible(di9Var2.x().k.h.c);
        }
        z4p z4pVar6 = u440Var2.t;
        if (z4pVar6 != null) {
            z4pVar6.setStickersSelectionVisible(di9Var2.x().k.h.d);
        }
        z4p z4pVar7 = u440Var2.t;
        if (z4pVar7 != null) {
            z4pVar7.setBackgroundSelectionAvailable(di9Var2.x().k.h.e);
        }
        boolean z3 = !u440Var2.y6() && di9Var2.x().k.h.f;
        z4p z4pVar8 = u440Var2.t;
        if (z4pVar8 != null) {
            z4pVar8.setMusicButtonVisible(z3);
        }
        z4p z4pVar9 = u440Var2.t;
        if (z4pVar9 != null) {
            z4pVar9.setDrawingVisible(di9Var2.x().k.h.g);
        }
        if (di9Var2.x().k.h.h) {
            StoryEditorCameraParams x = di9Var2.x();
            if (x.d == null && x.f == null) {
                StoryEditorCameraParams.Attaches attaches = x.l;
                if (attaches.k == null && attaches.b == null && attaches.c == null && x.j == null && attaches.j == null) {
                    z2 = true;
                    z4pVar = u440Var2.t;
                    if (z4pVar != null) {
                        z4pVar.setNewFrameVisible(z2 && ((str = di9Var2.x().m.g) == null || str.length() == 0));
                    }
                    z4pVar2 = u440Var2.t;
                    if (z4pVar2 != null) {
                        z4pVar2.setSaveToDeviceVisible(di9Var2.x().k.h.i);
                    }
                    z4pVar3 = u440Var2.t;
                    if (z4pVar3 != null) {
                        z4pVar3.setAdMarkVisible(di9Var2.x().k.h.j);
                    }
                    u440Var2.J7(true);
                    u440Var2.I2(u440Var2.V.getName(), null);
                    u440Var2.D7().j(u440Var2.H2(), commonUploadParams, di9Var2.x().e);
                    u440Var2.i.post(new ep0(u440Var2, 2));
                    u440Var2.F0 = false;
                    if (!u440Var2.I7()) {
                        int i3 = 1;
                        if (arrayList.size() != 1 || !((tam0) j5g.Y(arrayList)).g) {
                            if (arrayList.size() > 1) {
                                u440Var2.Y7(arrayList, new kn20(u440Var2, 4));
                            } else {
                                u440Var2.a(new io.reactivex.rxjava3.internal.operators.observable.s0(new vyt(u440Var2, i3)).r0(k86.n0).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ff3(new eiz(u440Var2, 12), 19), new cc20(new ugm(u440Var2, 24), i2)));
                            }
                            u440 u440Var3 = (u440) ref$ObjectRef.element;
                            int g2 = di9Var.g();
                            u440Var3.D0 = g2;
                            float f = g2 != 1 ? g2 != 3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 90.0f : -90.0f;
                            ((g440) u440Var3.s).X7(f);
                            u440Var3.j.u(f);
                            return (p5p) ref$ObjectRef2.element;
                        }
                    }
                    u440Var2.c8();
                    u440 u440Var32 = (u440) ref$ObjectRef.element;
                    int g22 = di9Var.g();
                    u440Var32.D0 = g22;
                    if (g22 != 1) {
                    }
                    ((g440) u440Var32.s).X7(f);
                    u440Var32.j.u(f);
                    return (p5p) ref$ObjectRef2.element;
                }
            }
        }
        z2 = false;
        z4pVar = u440Var2.t;
        if (z4pVar != null) {
        }
        z4pVar2 = u440Var2.t;
        if (z4pVar2 != null) {
        }
        z4pVar3 = u440Var2.t;
        if (z4pVar3 != null) {
        }
        u440Var2.J7(true);
        u440Var2.I2(u440Var2.V.getName(), null);
        u440Var2.D7().j(u440Var2.H2(), commonUploadParams, di9Var2.x().e);
        u440Var2.i.post(new ep0(u440Var2, 2));
        u440Var2.F0 = false;
        if (!u440Var2.I7()) {
        }
        u440Var2.c8();
        u440 u440Var322 = (u440) ref$ObjectRef.element;
        int g222 = di9Var.g();
        u440Var322.D0 = g222;
        if (g222 != 1) {
        }
        ((g440) u440Var322.s).X7(f);
        u440Var322.j.u(f);
        return (p5p) ref$ObjectRef2.element;
    }

    @Override // xsna.q1m0
    public final void b(p5p p5pVar, StoryMultiData storyMultiData, String str, a.h hVar) {
        u76 presenter;
        CommonUploadParams commonUploadParams = storyMultiData.d;
        y440 y440Var = p5pVar instanceof y440 ? (y440) p5pVar : null;
        if (y440Var == null || (presenter = y440Var.getPresenter()) == null) {
            return;
        }
        new e8j0.a(fkq0.c(commonUploadParams.e) ? fkq0.e(commonUploadParams.e) : commonUploadParams.b, y440Var, storyMultiData, presenter, str, new r1m0(1, hVar, q1m0.a.class, "onPublishCallback", "onPublishCallback(Lcom/vk/dto/common/id/UserId;)V", 0), new ofo(2, y440Var, presenter), hVar.a, new s1m0(0, hVar, q1m0.a.class, "onCloseCallback", "onCloseCallback()V", 0)).I0("ShareStoryBottomSheet");
    }
}
