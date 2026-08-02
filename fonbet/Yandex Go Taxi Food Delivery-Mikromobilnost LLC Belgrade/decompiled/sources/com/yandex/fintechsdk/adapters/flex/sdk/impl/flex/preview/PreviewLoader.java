package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.AssetReader;
import defpackage.c0m;
import defpackage.cnr0;
import defpackage.d0m;
import defpackage.gtq0;
import defpackage.lyg;
import defpackage.mjm0;
import defpackage.qcx;
import defpackage.qoi0;
import defpackage.sbx;
import defpackage.see;
import defpackage.wwl;
import defpackage.ywl;
import defpackage.zcx;
import flex.parser.FlexParserException;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010!\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "", "Landroid/content/Context;", "context", "Ld0m;", "documentJsonProvider", "", "isSpinnerPreviewEnabled", "<init>", "(Landroid/content/Context;Ld0m;Z)V", "", "assetFileName", "Lywl;", "loadFlexPreviewDocument", "(Ljava/lang/String;)Lywl;", "Lsbx;", "json", "Lkotlinx/serialization/json/c;", "documentJson", "Lsee;", "parseContent", "(Lsbx;Lkotlinx/serialization/json/c;)Lsee;", "Lmjm0;", "parseScaffold", "(Lsbx;Lkotlinx/serialization/json/c;)Lmjm0;", "assetRef", "readAssetFile", "(Ljava/lang/String;)Ljava/lang/String;", "Lwwl;", "createCrossFadeTransitionSettings", "()Lwwl;", "loadPreviewDocument$impl_18_1_0_release", "()Lywl;", "loadPreviewDocument", "Landroid/content/Context;", "Ld0m;", "Z", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewLoader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DEFAULT_SPINNER_ASSET_NAME = "finsdk_default_flex_loader.json";
    private final Context context;
    private final d0m documentJsonProvider;
    private final boolean isSpinnerPreviewEnabled;

    public PreviewLoader(Context context, d0m d0mVar, boolean z) {
        this.context = context;
        this.documentJsonProvider = d0mVar;
        this.isSpinnerPreviewEnabled = z;
    }

    private final wwl createCrossFadeTransitionSettings() {
        return TransitionSettingsKt.crossFadeTransitionSettings();
    }

    private final ywl loadFlexPreviewDocument(String assetFileName) {
        String readAssetFile = readAssetFile(assetFileName);
        if (readAssetFile == null) {
            return null;
        }
        zcx zcxVar = this.documentJsonProvider.a(new c0m(0)).a;
        return new ywl(parseContent(zcxVar, qcx.m(zcxVar.d(readAssetFile))), parseScaffold(zcxVar, qcx.m(zcxVar.d(readAssetFile))), new cnr0(b.f()), null, null, createCrossFadeTransitionSettings());
    }

    private final see parseContent(sbx json2, c documentJson) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) documentJson.get("ui");
        if (bVar instanceof c) {
            return (see) json2.a(gtq0.B(json2.b, qoi0.a(see.class)), (c) bVar);
        }
        if (bVar != null) {
            throw new FlexParserException(new lyg("Content should be json object but actual value: " + bVar, null, 56));
        }
        throw new FlexParserException(new lyg("Missing mandatory field 'ui' (existing keys: " + documentJson.a.keySet() + Extension.C_BRAKE, null, 56));
    }

    private final mjm0 parseScaffold(sbx json2, c documentJson) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) documentJson.get("scaffold");
        if (bVar instanceof c) {
            return (mjm0) json2.a(gtq0.B(json2.b, qoi0.a(mjm0.class)), (c) bVar);
        }
        if (bVar != null) {
            throw new FlexParserException(new lyg("Scaffold should be json object but actual value: " + bVar, null, 56));
        }
        throw new FlexParserException(new lyg("Missing mandatory field 'scaffold' (existing keys: " + documentJson.a.keySet() + Extension.C_BRAKE, null, 56));
    }

    private final String readAssetFile(String assetRef) {
        return new AssetReader(this.context).readTextAsset(assetRef);
    }

    public final ywl loadPreviewDocument$impl_18_1_0_release() {
        if (this.isSpinnerPreviewEnabled) {
            return loadFlexPreviewDocument(DEFAULT_SPINNER_ASSET_NAME);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader$Companion;", "", "<init>", "()V", "DEFAULT_SPINNER_ASSET_NAME", "", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
