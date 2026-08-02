package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarNewVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr;
import com.vk.story.viewer.impl.presentation.stories.view.reactions.OnboardingType;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.jf20;
import xsna.m8j0;
import xsna.mr70;
import xsna.o4q0;
import xsna.p0y;
import xsna.r2c;
import xsna.u4a;
import xsna.uvo;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0262  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        wto0 wto0Var;
        Long a2;
        ReporterType reporterType;
        String str;
        String str2;
        UserId userId;
        SuperAppAnimation.a aVar;
        switch (this.b) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                accessibilityEvents.c("usersStartScreenCast(" + arrayList.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.SCREEN_CAST_STARTED, AccessibilityEvents.Event.SCREEN_CAST_STOPPED, arrayList);
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(new AuthorHeaderEvent.Info.a((AuthorHeaderConfig.Info.InfoSlotData.c) ((zak0) ((dq0) this.d).a).getValue()));
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke((rl1) this.d);
                return s3q0.a;
            case 3:
                return ((s290) ((AttachmentsEditorView) this.c).t.getValue()).a(((VideoFile) this.d).w2());
            case 4:
                return "UPLOAD_TRACE convertSimple: outputFile=" + ((File) this.c) + ", originFileUri=" + ((Uri) this.d);
            case 5:
                ((izs) this.c).invoke(new r2c.h(((q8c) this.d).b));
                return s3q0.a;
            case 6:
                dod.a((View[]) this.c, (izs) this.d, 3000L);
                return s3q0.a;
            case 7:
                ((izs) this.c).invoke(((zc0) this.d).g);
                return s3q0.a;
            case 8:
                hgm hgmVar = (hgm) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_message_cross_16), Integer.valueOf(R.attr.vk_ui_icon_tertiary));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setContentDescription(null);
                int i = hgmVar.l0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i, i, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                viewGroup.addView(vkImageSimple);
                return vkImageSimple;
            case 9:
                ((izs) this.c).invoke(new uvo.c((DurationOption) this.d));
                return s3q0.a;
            case 10:
                ((GroupCardItemVh) this.c).r((Group) this.d, false);
                return s3q0.a;
            case 11:
                p0y p0yVar = (p0y) this.c;
                p0y.a aVar2 = (p0y.a) this.d;
                io.reactivex.rxjava3.core.x<ConversationParams> joinConversationByLink = p0yVar.i.joinConversationByLink(aVar2.a, aVar2.b, p0yVar.l.generatePeerId(), p0yVar.k);
                q0y q0yVar = new q0y(p0yVar);
                joinConversationByLink.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.o(joinConversationByLink, q0yVar).l(r0y.b);
            case 12:
                r6y r6yVar = (r6y) this.c;
                String str3 = (String) this.d;
                fvv0 M = r6yVar.M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.GET_HEALTH_CONNECT_INFO)) != null) {
                    a.a(str3);
                }
                return s3q0.a;
            case 13:
                Context context = (Context) this.c;
                wih0.b.a aVar3 = (wih0.b.a) this.d;
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                String str4 = aVar3.j;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str4, str4));
                Toast.makeText(context, context.getString(R.string.link_copied), 0).show();
                return s3q0.a;
            case 14:
                jf20 jf20Var = (jf20) this.c;
                mdz mdzVar = (mdz) this.d;
                ReporterType reporterType2 = jf20Var.i;
                Name name = mdzVar.b;
                MessagesHistoryMergeReporter.Span span = MessagesHistoryMergeReporter.Span.ROOT;
                String str5 = "messages";
                if (name == span && (wto0Var = (wto0) jf20Var.c.get(mdzVar)) != null && (a2 = wto0Var.a()) != null) {
                    LinkedHashMap r = jf20Var.r();
                    Long m = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.MESSAGES_PROCESSING));
                    Long m2 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.SPACES_CALCULATING));
                    if (m != null && m2 != null) {
                        Long m3 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.RESETTING_CHUNK_IN_CACHE));
                        Long m4 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.TRIMMING_HISTORY_BEFORE));
                        Long m5 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.TRIMMING_HISTORY_AFTER));
                        Long m6 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.CROSS_LINKING_WITH_EDGE_CACHED_MESSAGES));
                        reporterType = reporterType2;
                        Long m7 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.SAVING_MESSAGES_HISTORY));
                        Long m8 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.SAVING_PEER_IS_EMPTY));
                        Long m9 = pli.m((Collection) r.get(MessagesHistoryMergeReporter.Span.UPDATING_PEER));
                        if (m7 != null && m8 != null && m9 != null) {
                            int i2 = jf20.a.$EnumSwitchMapping$1[reporterType.ordinal()];
                            if (i2 == 1) {
                                str = "messages";
                            } else if (i2 == 2) {
                                str = "group_messages";
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = RTCStatsConstants.KEY_CHANNELS;
                            }
                            String str6 = str;
                            s3w0 s3w0Var = new s3w0(PerformanceEventType.MESSAGES_HISTORY_MERGE.h(), false);
                            Long[] lArr = s3w0Var.j;
                            lArr[0] = a2;
                            s3w0Var.i[1] = str6;
                            lArr[1] = m;
                            lArr[2] = m2;
                            lArr[3] = m3;
                            lArr[4] = m4;
                            lArr[5] = m5;
                            lArr[6] = m6;
                            lArr[7] = m7;
                            lArr[8] = m8;
                            lArr[9] = m9;
                            lArr[15] = Long.valueOf(jf20Var.j);
                            s3w0Var.q();
                        }
                        if ((mdzVar.b != span ? mdzVar : null) != null) {
                            jf20Var.q(rl3.C(MessagesHistoryMergeReporter.Span.values()), mdzVar);
                            int i3 = jf20.a.$EnumSwitchMapping$1[reporterType.ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    str5 = "group_messages";
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str5 = RTCStatsConstants.KEY_CHANNELS;
                                }
                            }
                            wn6.w(jf20Var, mdzVar, new gd5(span, PerformanceEventType.MESSAGES_HISTORY_MERGE.h(), kf20.b, 2), Collections.singletonList(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(1, str5)), null, 92);
                        }
                        return s3q0.a;
                    }
                }
                reporterType = reporterType2;
                if ((mdzVar.b != span ? mdzVar : null) != null) {
                }
                return s3q0.a;
            case 15:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                kbj0 kbj0Var = (kbj0) this.d;
                if (!musicArtistCatalogRootVh.p) {
                    return null;
                }
                u4a u4aVar = musicArtistCatalogRootVh.m;
                mba mbaVar = u4aVar.c.a;
                u4a.a aVar4 = u4aVar.b;
                return new MusicPageToolbarNewVh(mbaVar, aVar4.f, kbj0Var, aVar4.c);
            case 16:
                izs izsVar = (izs) this.c;
                o4q0.a aVar5 = (o4q0.a) this.d;
                izsVar.invoke(mr70.a.b);
                o4q0.b bVar = aVar5.d;
                if (bVar != null && (str2 = bVar.b) != null) {
                    izsVar.invoke(new mr70.f(str2, ""));
                }
                return s3q0.a;
            case 17:
                aqw.o((q7v0) ((jd80) this.c).g.getValue(), ((OnboardingType) this.d).h(), new cf3(4));
                return s3q0.a;
            case 18:
                k0f0 k0f0Var = (k0f0) this.c;
                m0f0 m0f0Var = (m0f0) this.d;
                int i4 = k0f0Var.c;
                if (i4 == 0) {
                    if (k0f0Var.a == -2) {
                        m0f0Var.r.setVisibility(0);
                        m0f0Var.f(true);
                    } else {
                        m0f0Var.r.setVisibility(8);
                    }
                    m0f0Var.p.setVisibility(8);
                    m0f0Var.q.setVisibility(8);
                } else if (k0f0Var.k) {
                    String f = uqm0.f(i4);
                    ImageView imageView = m0f0Var.r;
                    TextView textView = m0f0Var.q;
                    imageView.setVisibility(0);
                    m0f0Var.p.setVisibility(8);
                    textView.setText(f);
                    textView.setVisibility(0);
                    m0f0Var.f(false);
                } else {
                    m0f0Var.r.setVisibility(0);
                    m0f0Var.d();
                    m0f0Var.p.setVisibility(0);
                    m0f0Var.q.setVisibility(8);
                    m0f0Var.o = false;
                    m0f0Var.f(false);
                }
                return s3q0.a;
            case 19:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                Boolean bool = Boolean.FALSE;
                wh50Var.setValue(bool);
                wh50Var2.setValue(bool);
                return s3q0.a;
            case 20:
                y7j0 y7j0Var = (y7j0) this.c;
                gpj0 gpj0Var = (gpj0) this.d;
                List<? extends hfz> list = y7j0Var.h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof m8j0.a) {
                        arrayList2.add(obj);
                    }
                }
                m8j0.a aVar6 = (m8j0.a) j5g.a0(arrayList2);
                return (aVar6 == null || (userId = aVar6.e) == null) ? gpj0Var.getUid() : userId;
            case 21:
                SuperAppFragment superAppFragment = (SuperAppFragment) this.c;
                SuperAppAnimation.a aVar7 = (SuperAppAnimation.a) this.d;
                SuperAppAnimation.b bVar2 = superAppFragment.i0;
                if (bVar2 != null && (aVar = bVar2.a) != null) {
                    aVar7 = aVar;
                }
                if (aVar7 != null) {
                    superAppFragment.qo(aVar7);
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                izs izsVar2 = (izs) this.d;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    izsVar2.invoke(dw20Var);
                }
                return s3q0.a;
        }
    }
}
