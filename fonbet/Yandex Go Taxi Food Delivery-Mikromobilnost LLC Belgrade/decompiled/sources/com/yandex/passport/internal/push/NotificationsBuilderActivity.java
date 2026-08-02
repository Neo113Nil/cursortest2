package com.yandex.passport.internal.push;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.a1;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.passport.R;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.mkn;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.uh6;
import defpackage.y8f;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 w2\u00020\u0001:\u0003xyzB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\u0003R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010&\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R+\u0010*\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R+\u0010.\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00108\u001a\u0002022\u0006\u0010\u0014\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0016\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R+\u0010@\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0016\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R+\u0010D\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0016\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R+\u0010H\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0016\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R+\u0010L\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u0016\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R+\u0010P\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010-\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R+\u0010T\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u0016\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010!R+\u0010X\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0016\u001a\u0004\bV\u0010\u001f\"\u0004\bW\u0010!R+\u0010\\\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010-\u001a\u0004\bZ\u0010/\"\u0004\b[\u00101R+\u0010`\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010-\u001a\u0004\b^\u0010/\"\u0004\b_\u00101R+\u0010d\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010-\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR(\u0010\u001b\u001a\u00020\u0013*\u00020e2\u0006\u0010h\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010i\"\u0004\b\u0019\u0010jR(\u0010\"\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010k\"\u0004\b \u0010lR(\u0010&\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b$\u0010k\"\u0004\b%\u0010lR(\u00108\u001a\u000202*\u00020e2\u0006\u0010h\u001a\u0002028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b4\u0010m\"\u0004\b6\u0010nR(\u0010*\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b(\u0010k\"\u0004\b)\u0010lR(\u0010<\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b:\u0010k\"\u0004\b;\u0010lR(\u0010.\u001a\u00020+*\u00020e2\u0006\u0010h\u001a\u00020+8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010o\"\u0004\b0\u0010pR(\u0010s\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bq\u0010k\"\u0004\br\u0010lR(\u0010D\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bB\u0010k\"\u0004\bC\u0010lR(\u0010H\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010k\"\u0004\bG\u0010lR(\u0010v\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bt\u0010k\"\u0004\bu\u0010lR(\u0010P\u001a\u00020+*\u00020e2\u0006\u0010h\u001a\u00020+8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bN\u0010o\"\u0004\bO\u0010pR(\u0010T\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bR\u0010k\"\u0004\bS\u0010lR(\u0010X\u001a\u00020\u001c*\u00020e2\u0006\u0010h\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bV\u0010k\"\u0004\bW\u0010lR(\u0010\\\u001a\u00020+*\u00020e2\u0006\u0010h\u001a\u00020+8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bZ\u0010o\"\u0004\b[\u0010pR(\u0010`\u001a\u00020+*\u00020e2\u0006\u0010h\u001a\u00020+8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b^\u0010o\"\u0004\b_\u0010pR(\u0010d\u001a\u00020+*\u00020e2\u0006\u0010h\u001a\u00020+8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bb\u0010o\"\u0004\bc\u0010p¨\u0006{"}, d2 = {"Lcom/yandex/passport/internal/push/NotificationsBuilderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "setupToolBar", "showNotificationAsync", "Lcom/yandex/passport/internal/push/o;", "notificationsBuilderViewModel$delegate", "Li3y;", "getNotificationsBuilderViewModel", "()Lcom/yandex/passport/internal/push/o;", "notificationsBuilderViewModel", "", "<set-?>", "passpAmProto$delegate", "Lcom/yandex/passport/internal/push/m;", "getPasspAmProto", "()F", "setPasspAmProto", "(F)V", "passpAmProto", "", "pushService$delegate", "getPushService", "()Ljava/lang/String;", "setPushService", "(Ljava/lang/String;)V", "pushService", "eventName$delegate", "getEventName", "setEventName", "eventName", "pushId$delegate", "getPushId", "setPushId", "pushId", "", "isSilent$delegate", "Lcom/yandex/passport/internal/push/k;", "isSilent", "()Z", "setSilent", "(Z)V", "", "uid$delegate", "getUid", "()J", "setUid", "(J)V", "uid", "minAmVersion$delegate", "getMinAmVersion", "setMinAmVersion", "minAmVersion", "titleNotification$delegate", "getTitleNotification", "setTitleNotification", "titleNotification", "body$delegate", "getBody", "setBody", "body", "subtitle$delegate", "getSubtitle", "setSubtitle", "subtitle", "webViewUrl$delegate", "getWebViewUrl", "setWebViewUrl", "webViewUrl", "requireWebAuth$delegate", "getRequireWebAuth", "setRequireWebAuth", "requireWebAuth", "bodyIncludeCode$delegate", "getBodyIncludeCode", "setBodyIncludeCode", "bodyIncludeCode", "trackId$delegate", "getTrackId", "setTrackId", "trackId", "showCode$delegate", "getShowCode", "setShowCode", "showCode", "openInBrowser$delegate", "getOpenInBrowser", "setOpenInBrowser", "openInBrowser", "requireWebAuthWithUid$delegate", "getRequireWebAuthWithUid", "setRequireWebAuthWithUid", "requireWebAuthWithUid", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "value", "(Landroid/content/SharedPreferences;)F", "(Landroid/content/SharedPreferences;F)V", "(Landroid/content/SharedPreferences;)Ljava/lang/String;", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "(Landroid/content/SharedPreferences;)J", "(Landroid/content/SharedPreferences;J)V", "(Landroid/content/SharedPreferences;)Z", "(Landroid/content/SharedPreferences;Z)V", "getTitle", "setTitle", "title", "getWebviewUrl", "setWebviewUrl", "webviewUrl", "Companion", "com/yandex/passport/internal/push/k", "com/yandex/passport/internal/push/m", "com/yandex/passport/internal/push/l", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationsBuilderActivity extends AppCompatActivity {

    /* renamed from: body$delegate, reason: from kotlin metadata */
    private final m body;

    /* renamed from: bodyIncludeCode$delegate, reason: from kotlin metadata */
    private final m bodyIncludeCode;

    /* renamed from: eventName$delegate, reason: from kotlin metadata */
    private final m eventName;

    /* renamed from: isSilent$delegate, reason: from kotlin metadata */
    private final k isSilent;

    /* renamed from: minAmVersion$delegate, reason: from kotlin metadata */
    private final m minAmVersion;

    /* renamed from: notificationsBuilderViewModel$delegate, reason: from kotlin metadata */
    private final i3y notificationsBuilderViewModel = new es31(qoi0.a(o.class), new sls(this) { // from class: com.yandex.passport.internal.push.NotificationsBuilderActivity$special$$inlined$viewModels$default$2
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }, new a1(8), new sls(this) { // from class: com.yandex.passport.internal.push.NotificationsBuilderActivity$special$$inlined$viewModels$default$3
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : y8fVar;
        }
    });

    /* renamed from: openInBrowser$delegate, reason: from kotlin metadata */
    private final k openInBrowser;

    /* renamed from: passpAmProto$delegate, reason: from kotlin metadata */
    private final m passpAmProto;
    private SharedPreferences preferences;

    /* renamed from: pushId$delegate, reason: from kotlin metadata */
    private final m pushId;

    /* renamed from: pushService$delegate, reason: from kotlin metadata */
    private final m pushService;

    /* renamed from: requireWebAuth$delegate, reason: from kotlin metadata */
    private final k requireWebAuth;

    /* renamed from: requireWebAuthWithUid$delegate, reason: from kotlin metadata */
    private final k requireWebAuthWithUid;

    /* renamed from: showCode$delegate, reason: from kotlin metadata */
    private final k showCode;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    private final m subtitle;

    /* renamed from: titleNotification$delegate, reason: from kotlin metadata */
    private final m titleNotification;

    /* renamed from: trackId$delegate, reason: from kotlin metadata */
    private final m trackId;

    /* renamed from: uid$delegate, reason: from kotlin metadata */
    private final m uid;

    /* renamed from: webViewUrl$delegate, reason: from kotlin metadata */
    private final m webViewUrl;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("passpAmProto", 0, "getPasspAmProto()F", NotificationsBuilderActivity.class), oyr.B(qoi0.a, NotificationsBuilderActivity.class, "pushService", "getPushService()Ljava/lang/String;", 0), new MutablePropertyReference1Impl("eventName", 0, "getEventName()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("pushId", 0, "getPushId()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("isSilent", 0, "isSilent()Z", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("uid", 0, "getUid()J", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("minAmVersion", 0, "getMinAmVersion()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("titleNotification", 0, "getTitleNotification()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("body", 0, "getBody()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("subtitle", 0, "getSubtitle()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("webViewUrl", 0, "getWebViewUrl()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("requireWebAuth", 0, "getRequireWebAuth()Z", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("bodyIncludeCode", 0, "getBodyIncludeCode()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("trackId", 0, "getTrackId()Ljava/lang/String;", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("showCode", 0, "getShowCode()Z", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("openInBrowser", 0, "getOpenInBrowser()Z", NotificationsBuilderActivity.class), new MutablePropertyReference1Impl("requireWebAuthWithUid", 0, "getRequireWebAuthWithUid()Z", NotificationsBuilderActivity.class)};
    public static final l Companion = new l();
    public static final int $stable = 8;

    public NotificationsBuilderActivity() {
        int i = R.id.input_passp_am_proto;
        l lVar = Companion;
        this.passpAmProto = new m(this, i, new NotificationsBuilderActivity$passpAmProto$2(1, lVar, l.class, "stringToFloatMapper", "stringToFloatMapper(Ljava/lang/String;)F", 0), new NotificationsBuilderActivity$passpAmProto$3(1, lVar, l.class, "floatToStringMapper", "floatToStringMapper(F)Ljava/lang/String;", 0));
        this.pushService = new m(this, R.id.input_push_service, new NotificationsBuilderActivity$pushService$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$pushService$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.eventName = new m(this, R.id.input_event_name, new NotificationsBuilderActivity$eventName$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$eventName$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.pushId = new m(this, R.id.input_push_id, new NotificationsBuilderActivity$pushId$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$pushId$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.isSilent = new k(this, R.id.input_is_silent);
        this.uid = new m(this, R.id.input_uid, new NotificationsBuilderActivity$uid$2(1, lVar, l.class, "stringToLongMapper", "stringToLongMapper(Ljava/lang/String;)J", 0), new NotificationsBuilderActivity$uid$3(1, lVar, l.class, "longToStringMapper", "longToStringMapper(J)Ljava/lang/String;", 0));
        this.minAmVersion = new m(this, R.id.input_min_am_version, new NotificationsBuilderActivity$minAmVersion$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$minAmVersion$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.titleNotification = new m(this, R.id.input_title, new NotificationsBuilderActivity$titleNotification$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$titleNotification$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.body = new m(this, R.id.input_body, new NotificationsBuilderActivity$body$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$body$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.subtitle = new m(this, R.id.input_subtitle, new NotificationsBuilderActivity$subtitle$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$subtitle$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.webViewUrl = new m(this, R.id.input_webview_url, new NotificationsBuilderActivity$webViewUrl$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$webViewUrl$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.requireWebAuth = new k(this, R.id.input_require_web_auth);
        this.bodyIncludeCode = new m(this, R.id.input_body_include_code, new NotificationsBuilderActivity$bodyIncludeCode$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$bodyIncludeCode$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.trackId = new m(this, R.id.input_track_id, new NotificationsBuilderActivity$trackId$2(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0), new NotificationsBuilderActivity$trackId$3(1, lVar, l.class, "stringToStringMapper", "stringToStringMapper(Ljava/lang/String;)Ljava/lang/String;", 0));
        this.showCode = new k(this, R.id.input_show_code);
        this.openInBrowser = new k(this, R.id.input_open_in_browser);
        this.requireWebAuthWithUid = new k(this, R.id.input_require_web_auth_with_uid);
    }

    private final String getBody() {
        m mVar = this.body;
        kgx kgxVar = $$delegatedProperties[8];
        return (String) mVar.a();
    }

    private final String getBodyIncludeCode() {
        m mVar = this.bodyIncludeCode;
        kgx kgxVar = $$delegatedProperties[12];
        return (String) mVar.a();
    }

    private final String getEventName() {
        m mVar = this.eventName;
        kgx kgxVar = $$delegatedProperties[2];
        return (String) mVar.a();
    }

    private final String getMinAmVersion() {
        m mVar = this.minAmVersion;
        kgx kgxVar = $$delegatedProperties[6];
        return (String) mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getNotificationsBuilderViewModel() {
        return (o) this.notificationsBuilderViewModel.getValue();
    }

    private final boolean getOpenInBrowser() {
        k kVar = this.openInBrowser;
        kgx kgxVar = $$delegatedProperties[15];
        return kVar.a().booleanValue();
    }

    private final float getPasspAmProto() {
        m mVar = this.passpAmProto;
        kgx kgxVar = $$delegatedProperties[0];
        return ((Number) mVar.a()).floatValue();
    }

    private final String getPushId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("push_id", UUID.randomUUID().toString());
    }

    private final String getPushService() {
        m mVar = this.pushService;
        kgx kgxVar = $$delegatedProperties[1];
        return (String) mVar.a();
    }

    private final boolean getRequireWebAuth() {
        k kVar = this.requireWebAuth;
        kgx kgxVar = $$delegatedProperties[11];
        return kVar.a().booleanValue();
    }

    private final boolean getRequireWebAuthWithUid() {
        k kVar = this.requireWebAuthWithUid;
        kgx kgxVar = $$delegatedProperties[16];
        return kVar.a().booleanValue();
    }

    private final boolean getShowCode() {
        k kVar = this.showCode;
        kgx kgxVar = $$delegatedProperties[14];
        return kVar.a().booleanValue();
    }

    private final String getSubtitle() {
        m mVar = this.subtitle;
        kgx kgxVar = $$delegatedProperties[9];
        return (String) mVar.a();
    }

    private final String getTitle(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("title", "notification title");
    }

    private final String getTitleNotification() {
        m mVar = this.titleNotification;
        kgx kgxVar = $$delegatedProperties[7];
        return (String) mVar.a();
    }

    private final String getTrackId() {
        m mVar = this.trackId;
        kgx kgxVar = $$delegatedProperties[13];
        return (String) mVar.a();
    }

    private final long getUid() {
        m mVar = this.uid;
        kgx kgxVar = $$delegatedProperties[5];
        return ((Number) mVar.a()).longValue();
    }

    private final String getWebViewUrl() {
        m mVar = this.webViewUrl;
        kgx kgxVar = $$delegatedProperties[10];
        return (String) mVar.a();
    }

    private final String getWebviewUrl(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("webview_url", "https://passport-rc.yandex.ru/am/push/getcode?track_id=6b7c29549652e6e3b01ae4e2f3ebb486e2");
    }

    private final boolean isSilent() {
        k kVar = this.isSilent;
        kgx kgxVar = $$delegatedProperties[4];
        return kVar.a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 notificationsBuilderViewModel_delegate$lambda$0() {
        return new n();
    }

    private final void setBody(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("body", str).apply();
    }

    private final void setBodyIncludeCode(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("body_include_code", str).apply();
    }

    private final void setEventName(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("event_name", str).apply();
    }

    private final void setMinAmVersion(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("min_am_version", str).apply();
    }

    private final void setOpenInBrowser(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean("open_in_browser", z).apply();
    }

    private final void setPasspAmProto(float f) {
        m mVar = this.passpAmProto;
        kgx kgxVar = $$delegatedProperties[0];
        mVar.b(Float.valueOf(f));
    }

    private final void setPushId(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("push_id", str).apply();
    }

    private final void setPushService(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("push_service", str).apply();
    }

    private final void setRequireWebAuth(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean("require_web_auth", z).apply();
    }

    private final void setRequireWebAuthWithUid(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean("require_web_auth_with_uid", z).apply();
    }

    private final void setShowCode(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean("show_code_in_notification", z).apply();
    }

    private final void setSilent(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean("is_silent", z).apply();
    }

    private final void setSubtitle(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("subtitle", str).apply();
    }

    private final void setTitle(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("title", str).apply();
    }

    private final void setTitleNotification(String str) {
        m mVar = this.titleNotification;
        kgx kgxVar = $$delegatedProperties[7];
        mVar.b(str);
    }

    private final void setTrackId(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("track_id", str).apply();
    }

    private final void setUid(long j) {
        m mVar = this.uid;
        kgx kgxVar = $$delegatedProperties[5];
        mVar.b(Long.valueOf(j));
    }

    private final void setWebViewUrl(String str) {
        m mVar = this.webViewUrl;
        kgx kgxVar = $$delegatedProperties[10];
        mVar.b(str);
    }

    private final void setWebviewUrl(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().putString("webview_url", str).apply();
    }

    private final void setupToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new j(this, 1));
        setTitle("Notification Builder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationAsync() {
        o notificationsBuilderViewModel = getNotificationsBuilderViewModel();
        b0 b0Var = new b0();
        String valueOf = String.valueOf(getPasspAmProto());
        Bundle bundle = b0Var.a;
        bundle.putString("passp_am_proto", valueOf);
        bundle.putString("push_service", getPushService());
        bundle.putString("event_name", getEventName());
        bundle.putString(ClidProvider.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        bundle.putString("uid", String.valueOf(getUid()));
        bundle.putString("push_id", getPushId());
        bundle.putString("min_am_version", getMinAmVersion());
        bundle.putString("is_silent", String.valueOf(isSilent()));
        bundle.putString("title", getTitleNotification());
        bundle.putString("body", getBody());
        bundle.putString("subtitle", getSubtitle());
        bundle.putString("webview_url", getWebViewUrl());
        bundle.putString("require_web_auth", String.valueOf(getRequireWebAuth()));
        bundle.putString("body_include_code", getBodyIncludeCode());
        bundle.putString("track_id", getTrackId());
        bundle.putString("show_code_in_notification", String.valueOf(getShowCode()));
        bundle.putString("open_in_browser", String.valueOf(getOpenInBrowser()));
        bundle.putString("require_web_auth_with_uid", String.valueOf(getRequireWebAuthWithUid()));
        notificationsBuilderViewModel.getClass();
        tje.N(ds31.a(notificationsBuilderViewModel), null, null, new NotificationsBuilderViewModel$showPushNotification$1(notificationsBuilderViewModel, bundle, null), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        mkn.b(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passport_activity_notifications_builder);
        setupToolBar();
        View rootView = getWindow().getDecorView().getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        int i = 0;
        if (viewGroup != null) {
            View v = uh6.v(viewGroup, 0);
            com.yandex.passport.common.util.b bVar = new com.yandex.passport.common.util.b(i);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.o(v, bVar);
        }
        tje.N(eja1.s(this), null, null, new NotificationsBuilderActivity$onCreate$1(this, null), 3);
        SharedPreferences sharedPreferences = getSharedPreferences("test-app-notifications", 0);
        this.preferences = sharedPreferences;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        setPasspAmProto(getPasspAmProto(sharedPreferences));
        SharedPreferences sharedPreferences2 = this.preferences;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        setPushService(getPushService(sharedPreferences2));
        SharedPreferences sharedPreferences3 = this.preferences;
        if (sharedPreferences3 == null) {
            sharedPreferences3 = null;
        }
        setEventName(getEventName(sharedPreferences3));
        SharedPreferences sharedPreferences4 = this.preferences;
        if (sharedPreferences4 == null) {
            sharedPreferences4 = null;
        }
        setUid(getUid(sharedPreferences4));
        SharedPreferences sharedPreferences5 = this.preferences;
        if (sharedPreferences5 == null) {
            sharedPreferences5 = null;
        }
        setPushId(getPushId(sharedPreferences5));
        SharedPreferences sharedPreferences6 = this.preferences;
        if (sharedPreferences6 == null) {
            sharedPreferences6 = null;
        }
        setMinAmVersion(getMinAmVersion(sharedPreferences6));
        SharedPreferences sharedPreferences7 = this.preferences;
        if (sharedPreferences7 == null) {
            sharedPreferences7 = null;
        }
        setSilent(isSilent(sharedPreferences7));
        SharedPreferences sharedPreferences8 = this.preferences;
        if (sharedPreferences8 == null) {
            sharedPreferences8 = null;
        }
        setTitleNotification(getTitle(sharedPreferences8));
        SharedPreferences sharedPreferences9 = this.preferences;
        if (sharedPreferences9 == null) {
            sharedPreferences9 = null;
        }
        setBody(getBody(sharedPreferences9));
        SharedPreferences sharedPreferences10 = this.preferences;
        if (sharedPreferences10 == null) {
            sharedPreferences10 = null;
        }
        setSubtitle(getSubtitle(sharedPreferences10));
        SharedPreferences sharedPreferences11 = this.preferences;
        if (sharedPreferences11 == null) {
            sharedPreferences11 = null;
        }
        setWebViewUrl(getWebviewUrl(sharedPreferences11));
        SharedPreferences sharedPreferences12 = this.preferences;
        if (sharedPreferences12 == null) {
            sharedPreferences12 = null;
        }
        setRequireWebAuth(getRequireWebAuth(sharedPreferences12));
        SharedPreferences sharedPreferences13 = this.preferences;
        if (sharedPreferences13 == null) {
            sharedPreferences13 = null;
        }
        setBodyIncludeCode(getBodyIncludeCode(sharedPreferences13));
        SharedPreferences sharedPreferences14 = this.preferences;
        if (sharedPreferences14 == null) {
            sharedPreferences14 = null;
        }
        setTrackId(getTrackId(sharedPreferences14));
        SharedPreferences sharedPreferences15 = this.preferences;
        if (sharedPreferences15 == null) {
            sharedPreferences15 = null;
        }
        setShowCode(getShowCode(sharedPreferences15));
        SharedPreferences sharedPreferences16 = this.preferences;
        if (sharedPreferences16 == null) {
            sharedPreferences16 = null;
        }
        setOpenInBrowser(getOpenInBrowser(sharedPreferences16));
        SharedPreferences sharedPreferences17 = this.preferences;
        setRequireWebAuthWithUid(getRequireWebAuthWithUid(sharedPreferences17 != null ? sharedPreferences17 : null));
        findViewById(R.id.show_notification).setOnClickListener(new j(this, i));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        setPasspAmProto(sharedPreferences, getPasspAmProto());
        SharedPreferences sharedPreferences2 = this.preferences;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        setPushService(sharedPreferences2, getPushService());
        SharedPreferences sharedPreferences3 = this.preferences;
        if (sharedPreferences3 == null) {
            sharedPreferences3 = null;
        }
        setUid(sharedPreferences3, getUid());
        SharedPreferences sharedPreferences4 = this.preferences;
        if (sharedPreferences4 == null) {
            sharedPreferences4 = null;
        }
        setPushId(sharedPreferences4, getPushId());
        SharedPreferences sharedPreferences5 = this.preferences;
        if (sharedPreferences5 == null) {
            sharedPreferences5 = null;
        }
        setMinAmVersion(sharedPreferences5, getMinAmVersion());
        SharedPreferences sharedPreferences6 = this.preferences;
        if (sharedPreferences6 == null) {
            sharedPreferences6 = null;
        }
        setSilent(sharedPreferences6, isSilent());
        SharedPreferences sharedPreferences7 = this.preferences;
        if (sharedPreferences7 == null) {
            sharedPreferences7 = null;
        }
        setTitle(sharedPreferences7, getTitleNotification());
        SharedPreferences sharedPreferences8 = this.preferences;
        if (sharedPreferences8 == null) {
            sharedPreferences8 = null;
        }
        setBody(sharedPreferences8, getBody());
        SharedPreferences sharedPreferences9 = this.preferences;
        if (sharedPreferences9 == null) {
            sharedPreferences9 = null;
        }
        setSubtitle(sharedPreferences9, getSubtitle());
        SharedPreferences sharedPreferences10 = this.preferences;
        if (sharedPreferences10 == null) {
            sharedPreferences10 = null;
        }
        setWebviewUrl(sharedPreferences10, getWebViewUrl());
        SharedPreferences sharedPreferences11 = this.preferences;
        if (sharedPreferences11 == null) {
            sharedPreferences11 = null;
        }
        setRequireWebAuth(sharedPreferences11, getRequireWebAuth());
        SharedPreferences sharedPreferences12 = this.preferences;
        if (sharedPreferences12 == null) {
            sharedPreferences12 = null;
        }
        setOpenInBrowser(sharedPreferences12, getOpenInBrowser());
        SharedPreferences sharedPreferences13 = this.preferences;
        setRequireWebAuthWithUid(sharedPreferences13 != null ? sharedPreferences13 : null, getRequireWebAuthWithUid());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        setPasspAmProto(getPasspAmProto(sharedPreferences));
        SharedPreferences sharedPreferences2 = this.preferences;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        setPushService(getPushService(sharedPreferences2));
        SharedPreferences sharedPreferences3 = this.preferences;
        if (sharedPreferences3 == null) {
            sharedPreferences3 = null;
        }
        setUid(getUid(sharedPreferences3));
        SharedPreferences sharedPreferences4 = this.preferences;
        if (sharedPreferences4 == null) {
            sharedPreferences4 = null;
        }
        setPushId(getPushId(sharedPreferences4));
        SharedPreferences sharedPreferences5 = this.preferences;
        if (sharedPreferences5 == null) {
            sharedPreferences5 = null;
        }
        setMinAmVersion(getMinAmVersion(sharedPreferences5));
        SharedPreferences sharedPreferences6 = this.preferences;
        if (sharedPreferences6 == null) {
            sharedPreferences6 = null;
        }
        setSilent(isSilent(sharedPreferences6));
        SharedPreferences sharedPreferences7 = this.preferences;
        if (sharedPreferences7 == null) {
            sharedPreferences7 = null;
        }
        setTitleNotification(getTitle(sharedPreferences7));
        SharedPreferences sharedPreferences8 = this.preferences;
        if (sharedPreferences8 == null) {
            sharedPreferences8 = null;
        }
        setBody(getBody(sharedPreferences8));
        SharedPreferences sharedPreferences9 = this.preferences;
        if (sharedPreferences9 == null) {
            sharedPreferences9 = null;
        }
        setSubtitle(getSubtitle(sharedPreferences9));
        SharedPreferences sharedPreferences10 = this.preferences;
        if (sharedPreferences10 == null) {
            sharedPreferences10 = null;
        }
        setWebViewUrl(getWebviewUrl(sharedPreferences10));
        SharedPreferences sharedPreferences11 = this.preferences;
        if (sharedPreferences11 == null) {
            sharedPreferences11 = null;
        }
        setRequireWebAuth(getRequireWebAuth(sharedPreferences11));
        SharedPreferences sharedPreferences12 = this.preferences;
        if (sharedPreferences12 == null) {
            sharedPreferences12 = null;
        }
        setShowCode(getShowCode(sharedPreferences12));
        SharedPreferences sharedPreferences13 = this.preferences;
        if (sharedPreferences13 == null) {
            sharedPreferences13 = null;
        }
        setOpenInBrowser(getOpenInBrowser(sharedPreferences13));
        SharedPreferences sharedPreferences14 = this.preferences;
        setRequireWebAuthWithUid(getRequireWebAuthWithUid(sharedPreferences14 != null ? sharedPreferences14 : null));
    }

    private final String getEventName(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("event_name", "2fa_code");
    }

    private final String getMinAmVersion(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("min_am_version", "7.55.1");
    }

    private final String getPushService(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("push_service", "2fa");
    }

    private final void setBody(String str) {
        m mVar = this.body;
        kgx kgxVar = $$delegatedProperties[8];
        mVar.b(str);
    }

    private final void setBodyIncludeCode(String str) {
        m mVar = this.bodyIncludeCode;
        kgx kgxVar = $$delegatedProperties[12];
        mVar.b(str);
    }

    private final void setEventName(String str) {
        m mVar = this.eventName;
        kgx kgxVar = $$delegatedProperties[2];
        mVar.b(str);
    }

    private final void setMinAmVersion(String str) {
        m mVar = this.minAmVersion;
        kgx kgxVar = $$delegatedProperties[6];
        mVar.b(str);
    }

    private final void setOpenInBrowser(boolean z) {
        k kVar = this.openInBrowser;
        kgx kgxVar = $$delegatedProperties[15];
        kVar.b(z);
    }

    private final void setPushId(String str) {
        m mVar = this.pushId;
        kgx kgxVar = $$delegatedProperties[3];
        mVar.b(str);
    }

    private final void setPushService(String str) {
        m mVar = this.pushService;
        kgx kgxVar = $$delegatedProperties[1];
        mVar.b(str);
    }

    private final void setRequireWebAuth(boolean z) {
        k kVar = this.requireWebAuth;
        kgx kgxVar = $$delegatedProperties[11];
        kVar.b(z);
    }

    private final void setRequireWebAuthWithUid(boolean z) {
        k kVar = this.requireWebAuthWithUid;
        kgx kgxVar = $$delegatedProperties[16];
        kVar.b(z);
    }

    private final void setShowCode(boolean z) {
        k kVar = this.showCode;
        kgx kgxVar = $$delegatedProperties[14];
        kVar.b(z);
    }

    private final void setSilent(boolean z) {
        k kVar = this.isSilent;
        kgx kgxVar = $$delegatedProperties[4];
        kVar.b(z);
    }

    private final void setSubtitle(String str) {
        m mVar = this.subtitle;
        kgx kgxVar = $$delegatedProperties[9];
        mVar.b(str);
    }

    private final void setTrackId(String str) {
        m mVar = this.trackId;
        kgx kgxVar = $$delegatedProperties[13];
        mVar.b(str);
    }

    private final String getBody(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("body", "notification body");
    }

    private final String getBodyIncludeCode(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("body_include_code", "notification body: %s");
    }

    private final String getPushId() {
        m mVar = this.pushId;
        kgx kgxVar = $$delegatedProperties[3];
        return (String) mVar.a();
    }

    private final String getSubtitle(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("subtitle", "notification subtitle");
    }

    private final String getTrackId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("track_id", "track_id");
    }

    private final void setPasspAmProto(SharedPreferences sharedPreferences, float f) {
        sharedPreferences.edit().putFloat("passp_am_proto", f).apply();
    }

    private final void setUid(SharedPreferences sharedPreferences, long j) {
        sharedPreferences.edit().putLong("uid", j).apply();
    }

    private final boolean isSilent(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("is_silent", false);
    }

    private final boolean getOpenInBrowser(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("open_in_browser", false);
    }

    private final boolean getRequireWebAuth(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("require_web_auth", false);
    }

    private final boolean getRequireWebAuthWithUid(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("require_web_auth_with_uid", false);
    }

    private final boolean getShowCode(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("show_code_in_notification", false);
    }

    private final float getPasspAmProto(SharedPreferences sharedPreferences) {
        return sharedPreferences.getFloat("passp_am_proto", 1.0f);
    }

    private final long getUid(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong("uid", -1L);
    }
}
