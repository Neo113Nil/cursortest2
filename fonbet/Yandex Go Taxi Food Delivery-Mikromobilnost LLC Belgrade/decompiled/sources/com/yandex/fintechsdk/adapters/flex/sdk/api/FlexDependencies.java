package com.yandex.fintechsdk.adapters.flex.sdk.api;

import android.content.Context;
import defpackage.ah5;
import defpackage.azw;
import defpackage.c190;
import defpackage.dh5;
import defpackage.gdr;
import defpackage.gzr;
import defpackage.kg5;
import defpackage.osu;
import defpackage.p85;
import defpackage.pao;
import defpackage.qmf;
import defpackage.ryw;
import defpackage.uyi0;
import defpackage.vg5;
import defpackage.vh5;
import defpackage.w6k;
import defpackage.xg5;
import defpackage.ys50;
import defpackage.zyw;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\u0018\u00002\u00020\u0001B«\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u00101\u001a\u000200\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020-\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040-\u0012\u0006\u00107\u001a\u000206\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080-¢\u0006\u0004\b:\u0010;R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010DR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\b\u001a\u0010YR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\b\u001c\u0010[R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\b\u001e\u0010]R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010d\u001a\u0004\be\u0010fR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u0010s\u001a\u0004\bt\u0010uR\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u0010v\u001a\u0004\bw\u0010xR\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020-8\u0006¢\u0006\f\n\u0004\b3\u0010s\u001a\u0004\by\u0010uR\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040-8\u0006¢\u0006\f\n\u0004\b5\u0010s\u001a\u0004\bz\u0010uR\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u0010{\u001a\u0004\b|\u0010}R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080-8\u0006¢\u0006\f\n\u0004\b9\u0010s\u001a\u0004\b~\u0010u¨\u0006\u007f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "", "", "Lkg5;", "Lig5;", "actionsInfo", "", "", "customViewConfigurations", "Lqmf;", "customViewFactoryDelegateCreator", "Lw6k;", "divActionHandlers", "", "divKitThemeResId", "Lvg5;", "errorHandler", "Lpao;", "errorViewFactory", "Lxg5;", "eventHandler", "Lgdr;", "firstInteractionEventsListener", "Lgzr;", "fontScaleOverride", "Lryw;", "isEngineErrorViewEnabled", "Lzyw;", "isRestoreStateEnabled", "Lazw;", "isSpinnerPreviewEnabled", "Lys50;", "networkEventsListener", "Luyi0;", "renderingEventsListener", "Lvh5;", "themeProvider", "Lah5;", "extraHeadersProvider", "Ldh5;", "extraQueriesProvider", "Losu;", "hostUrlProvider", "Lokhttp3/OkHttpClient$a;", "okHttpClientBuilder", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Landroid/content/Context;", "applicationContext", "Landroid/view/ViewGroup;", "containerProvider", "Landroidx/fragment/app/FragmentManager;", "fragmentManagerProvider", "Lc190;", "overlayConfigProvider", "Lcom/yandex/fintechsdk/core/navigation/impl/api/router/a;", "routerProvider", "<init>", "(Ljava/util/List;Ljava/util/Map;Lqmf;Ljava/util/Map;Ljava/lang/Integer;Lvg5;Lpao;Lxg5;Lgdr;Lgzr;Lryw;Lzyw;Lazw;Lys50;Luyi0;Lvh5;Lah5;Ldh5;Losu;Lokhttp3/OkHttpClient$a;Lp85;Landroid/content/Context;Lp85;Lp85;Lc190;Lp85;)V", "Ljava/util/List;", "getActionsInfo", "()Ljava/util/List;", "Ljava/util/Map;", "getCustomViewConfigurations", "()Ljava/util/Map;", "Lqmf;", "getCustomViewFactoryDelegateCreator", "()Lqmf;", "getDivActionHandlers", "Ljava/lang/Integer;", "getDivKitThemeResId", "()Ljava/lang/Integer;", "Lvg5;", "getErrorHandler", "()Lvg5;", "Lpao;", "getErrorViewFactory", "()Lpao;", "Lxg5;", "getEventHandler", "()Lxg5;", "Lgdr;", "getFirstInteractionEventsListener", "()Lgdr;", "Lgzr;", "getFontScaleOverride", "()Lgzr;", "Lryw;", "()Lryw;", "Lzyw;", "()Lzyw;", "Lazw;", "()Lazw;", "Lys50;", "getNetworkEventsListener", "()Lys50;", "Luyi0;", "getRenderingEventsListener", "()Luyi0;", "Lvh5;", "getThemeProvider", "()Lvh5;", "Lah5;", "getExtraHeadersProvider", "()Lah5;", "Ldh5;", "getExtraQueriesProvider", "()Ldh5;", "Losu;", "getHostUrlProvider", "()Losu;", "Lokhttp3/OkHttpClient$a;", "getOkHttpClientBuilder", "()Lokhttp3/OkHttpClient$a;", "Lp85;", "getActivityProvider", "()Lp85;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "getContainerProvider", "getFragmentManagerProvider", "Lc190;", "getOverlayConfigProvider", "()Lc190;", "getRouterProvider", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexDependencies {
    private final List<kg5> actionsInfo;
    private final p85 activityProvider;
    private final Context applicationContext;
    private final p85 containerProvider;
    private final Map<String, Object> customViewConfigurations;
    private final qmf customViewFactoryDelegateCreator;
    private final Map<String, w6k> divActionHandlers;
    private final Integer divKitThemeResId;
    private final vg5 errorHandler;
    private final pao errorViewFactory;
    private final xg5 eventHandler;
    private final ah5 extraHeadersProvider;
    private final dh5 extraQueriesProvider;
    private final gdr firstInteractionEventsListener;
    private final gzr fontScaleOverride;
    private final p85 fragmentManagerProvider;
    private final osu hostUrlProvider;
    private final ryw isEngineErrorViewEnabled;
    private final zyw isRestoreStateEnabled;
    private final azw isSpinnerPreviewEnabled;
    private final ys50 networkEventsListener;
    private final OkHttpClient.a okHttpClientBuilder;
    private final c190 overlayConfigProvider;
    private final uyi0 renderingEventsListener;
    private final p85 routerProvider;
    private final vh5 themeProvider;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FlexDependencies(java.util.List r30, java.util.Map r31, defpackage.qmf r32, java.util.Map r33, java.lang.Integer r34, defpackage.vg5 r35, defpackage.pao r36, defpackage.xg5 r37, defpackage.gdr r38, defpackage.gzr r39, defpackage.ryw r40, defpackage.zyw r41, defpackage.azw r42, defpackage.ys50 r43, defpackage.uyi0 r44, defpackage.vh5 r45, defpackage.ah5 r46, defpackage.dh5 r47, defpackage.osu r48, okhttp3.OkHttpClient.a r49, defpackage.p85 r50, android.content.Context r51, defpackage.p85 r52, defpackage.p85 r53, defpackage.c190 r54, defpackage.p85 r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            r29 = this;
            r0 = r56
            r1 = r0 & 8
            if (r1 == 0) goto Lc
            java.util.Map r1 = kotlin.collections.b.f()
            r6 = r1
            goto Le
        Lc:
            r6 = r33
        Le:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L15
            r7 = r2
            goto L17
        L15:
            r7 = r34
        L17:
            r1 = r0 & 64
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r36
        L1f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L25
            r11 = r2
            goto L27
        L25:
            r11 = r38
        L27:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L2f
            gzr r1 = defpackage.gzr.a
            r12 = r1
            goto L31
        L2f:
            r12 = r39
        L31:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L38
            r16 = r2
            goto L3a
        L38:
            r16 = r43
        L3a:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L69
            r17 = r2
            r3 = r30
            r4 = r31
            r5 = r32
            r8 = r35
            r10 = r37
            r13 = r40
            r14 = r41
            r15 = r42
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            r23 = r50
            r24 = r51
            r25 = r52
            r26 = r53
            r27 = r54
            r28 = r55
            r2 = r29
            goto L93
        L69:
            r17 = r44
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r8 = r35
            r10 = r37
            r13 = r40
            r14 = r41
            r15 = r42
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            r23 = r50
            r24 = r51
            r25 = r52
            r26 = r53
            r27 = r54
            r28 = r55
        L93:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies.<init>(java.util.List, java.util.Map, qmf, java.util.Map, java.lang.Integer, vg5, pao, xg5, gdr, gzr, ryw, zyw, azw, ys50, uyi0, vh5, ah5, dh5, osu, okhttp3.OkHttpClient$a, p85, android.content.Context, p85, p85, c190, p85, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<kg5> getActionsInfo() {
        return this.actionsInfo;
    }

    public final p85 getActivityProvider() {
        return this.activityProvider;
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final p85 getContainerProvider() {
        return this.containerProvider;
    }

    public final Map<String, Object> getCustomViewConfigurations() {
        return this.customViewConfigurations;
    }

    public final qmf getCustomViewFactoryDelegateCreator() {
        return this.customViewFactoryDelegateCreator;
    }

    public final Map<String, w6k> getDivActionHandlers() {
        return this.divActionHandlers;
    }

    public final Integer getDivKitThemeResId() {
        return this.divKitThemeResId;
    }

    public final vg5 getErrorHandler() {
        return this.errorHandler;
    }

    public final pao getErrorViewFactory() {
        return this.errorViewFactory;
    }

    public final xg5 getEventHandler() {
        return this.eventHandler;
    }

    public final ah5 getExtraHeadersProvider() {
        return this.extraHeadersProvider;
    }

    public final dh5 getExtraQueriesProvider() {
        return this.extraQueriesProvider;
    }

    public final gdr getFirstInteractionEventsListener() {
        return this.firstInteractionEventsListener;
    }

    public final gzr getFontScaleOverride() {
        return this.fontScaleOverride;
    }

    public final p85 getFragmentManagerProvider() {
        return this.fragmentManagerProvider;
    }

    public final osu getHostUrlProvider() {
        return this.hostUrlProvider;
    }

    public final ys50 getNetworkEventsListener() {
        return null;
    }

    public final OkHttpClient.a getOkHttpClientBuilder() {
        return this.okHttpClientBuilder;
    }

    public final c190 getOverlayConfigProvider() {
        return this.overlayConfigProvider;
    }

    public final uyi0 getRenderingEventsListener() {
        return this.renderingEventsListener;
    }

    public final p85 getRouterProvider() {
        return this.routerProvider;
    }

    public final vh5 getThemeProvider() {
        return this.themeProvider;
    }

    /* renamed from: isEngineErrorViewEnabled, reason: from getter */
    public final ryw getIsEngineErrorViewEnabled() {
        return this.isEngineErrorViewEnabled;
    }

    /* renamed from: isRestoreStateEnabled, reason: from getter */
    public final zyw getIsRestoreStateEnabled() {
        return this.isRestoreStateEnabled;
    }

    /* renamed from: isSpinnerPreviewEnabled, reason: from getter */
    public final azw getIsSpinnerPreviewEnabled() {
        return this.isSpinnerPreviewEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlexDependencies(List<? extends kg5> list, Map<String, Object> map, qmf qmfVar, Map<String, w6k> map2, Integer num, vg5 vg5Var, pao paoVar, xg5 xg5Var, gdr gdrVar, gzr gzrVar, ryw rywVar, zyw zywVar, azw azwVar, ys50 ys50Var, uyi0 uyi0Var, vh5 vh5Var, ah5 ah5Var, dh5 dh5Var, osu osuVar, OkHttpClient.a aVar, p85 p85Var, Context context, p85 p85Var2, p85 p85Var3, c190 c190Var, p85 p85Var4) {
        this.actionsInfo = list;
        this.customViewConfigurations = map;
        this.customViewFactoryDelegateCreator = qmfVar;
        this.divActionHandlers = map2;
        this.divKitThemeResId = num;
        this.errorHandler = vg5Var;
        this.errorViewFactory = paoVar;
        this.eventHandler = xg5Var;
        this.firstInteractionEventsListener = gdrVar;
        this.fontScaleOverride = gzrVar;
        this.isEngineErrorViewEnabled = rywVar;
        this.isRestoreStateEnabled = zywVar;
        this.isSpinnerPreviewEnabled = azwVar;
        this.renderingEventsListener = uyi0Var;
        this.themeProvider = vh5Var;
        this.extraHeadersProvider = ah5Var;
        this.extraQueriesProvider = dh5Var;
        this.hostUrlProvider = osuVar;
        this.okHttpClientBuilder = aVar;
        this.activityProvider = p85Var;
        this.applicationContext = context;
        this.containerProvider = p85Var2;
        this.fragmentManagerProvider = p85Var3;
        this.overlayConfigProvider = c190Var;
        this.routerProvider = p85Var4;
    }
}
