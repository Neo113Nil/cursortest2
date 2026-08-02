package ru.mail.libverify.api;

import android.net.Network;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.TimeUtils;
import ru.mail.libverify.InternalApi;
import ru.mail.libverify.R;
import ru.mail.libverify.a.a;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.common.DetailStatus;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.api.j;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.libverify.api.o;
import ru.mail.libverify.e.d;
import ru.mail.libverify.g.a;
import ru.mail.libverify.g.b;
import ru.mail.libverify.h.f;
import ru.mail.libverify.n0.a;
import ru.mail.libverify.o.b;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.platform.core.ServiceType;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.libverify.requests.j;
import ru.mail.libverify.utils.permissions.a;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.json.JsonParseException;
import ru.ok.android.api.json.JsonToken;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.b630;
import xsna.bqy;
import xsna.c6o;
import xsna.d9e0;
import xsna.eo1;
import xsna.fs2;
import xsna.gq4;
import xsna.gs2;
import xsna.hc3;
import xsna.jtd;
import xsna.kv2;
import xsna.li0;
import xsna.vrl;
import xsna.wd2;
import xsna.yn2;

@InternalApi
/* loaded from: classes9.dex */
public final class q implements VerificationApi, ru.mail.libverify.g0.c, j, ru.mail.libverify.p0.f {

    @NonNull
    private final ru.mail.libverify.u.y A;

    @NonNull
    private final ru.mail.libverify.b.b B;
    private ru.mail.libverify.n.m C;
    private ru.mail.libverify.n.h D;
    private ru.mail.libverify.b0.a E;
    private m F;
    private final ru.mail.libverify.u.z G;
    private final ru.mail.libverify.z.d H;

    @NonNull
    private final a.InterfaceC2188a I;
    private final AtomicReference<SignOutCallback> J;

    @NonNull
    private final ru.mail.libverify.o.e K;
    private final ConcurrentHashMap<ru.mail.libverify.e.f, Pair<String, Long>> L;

    @NonNull
    private final ru.mail.libverify.u.w a;

    @NonNull
    private final o b;

    @NonNull
    private final ru.mail.libverify.o.b f;

    @NonNull
    private final n g;

    @NonNull
    private final bqy<ru.mail.libverify.f.c> h;

    @NonNull
    private final bqy<ru.mail.libverify.api.e> i;

    @NonNull
    private final bqy<ru.mail.libverify.api.g> j;
    private final f l;
    private final ru.mail.libverify.c.b m;
    private final AtomicReference<String[]> n;

    @NonNull
    private final ru.mail.libverify.x.e o;

    @NonNull
    private final ru.mail.libverify.g0.d p;

    @NonNull
    private final MessageBus q;

    @NonNull
    private final ru.mail.libverify.c.g r;

    @NonNull
    private final bqy<ru.mail.libverify.g0.a> s;

    @NonNull
    private final ru.mail.libverify.m0.a t;

    @NonNull
    private final ru.mail.libverify.i0.a u;

    @NonNull
    private final bqy<ru.mail.libverify.h0.a> v;

    @NonNull
    private final Thread.UncaughtExceptionHandler w;

    @NonNull
    private final RejectedExecutionHandler x;

    @NonNull
    private final bqy<ru.mail.libverify.i.c> y;

    @NonNull
    private final bqy<ru.mail.libverify.j0.b> z;
    private final HashSet c = new HashSet();
    private final HashSet d = new HashSet();
    private final HashSet e = new HashSet();
    private final HashSet<String> k = new HashSet<>();

    public class a implements a.InterfaceC2188a {
        final /* synthetic */ ru.mail.libverify.g0.d a;
        final /* synthetic */ ru.mail.libverify.i0.a b;

        public a(ru.mail.libverify.g0.d dVar, ru.mail.libverify.i0.a aVar) {
            this.a = dVar;
            this.b = aVar;
        }

        @Override // ru.mail.libverify.a.a.InterfaceC2188a
        public final void a() {
            FileLog.d("VerificationApi", "lifecycleObserver: background");
            this.a.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APP_MOVE_TO_BACKGROUND, Long.valueOf(this.b.b())));
        }

        @Override // ru.mail.libverify.a.a.InterfaceC2188a
        public final void onResume() {
            FileLog.d("VerificationApi", "lifecycleObserver: foreground");
            this.a.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APP_MOVE_TO_FOREGROUND, Long.valueOf(this.b.b())));
        }
    }

    public class b implements a.InterfaceC2216a {
        final /* synthetic */ String[] a;
        final /* synthetic */ Runnable b;

        public b(String[] strArr, Runnable runnable) {
            this.a = strArr;
            this.b = runnable;
        }

        @Override // ru.mail.libverify.utils.permissions.a.InterfaceC2216a
        public final void a(@NonNull String str) {
            FileLog.d("VerificationApi", "permission %s granted", str);
        }

        @Override // ru.mail.libverify.utils.permissions.a.InterfaceC2216a
        public final void b(@NonNull String str) {
            FileLog.e("VerificationApi", "permission %s denied", str);
        }

        @Override // ru.mail.libverify.utils.permissions.a.InterfaceC2216a
        public final void onCompleted(boolean z) {
            FileLog.d("VerificationApi", "permission request %s completed (%s)", Arrays.toString(this.a), Boolean.valueOf(z));
            if (this.b != null) {
                q.this.p.b().post(this.b);
            }
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;
        static final /* synthetic */ int[] f;
        static final /* synthetic */ int[] g;
        static final /* synthetic */ int[] h;

        static {
            int[] iArr = new int[ServiceType.values().length];
            h = iArr;
            try {
                iArr[ServiceType.Huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                h[ServiceType.Firebase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ru.mail.libverify.p0.a.values().length];
            g = iArr2;
            try {
                iArr2[ru.mail.libverify.p0.a.VERIFY_API_IPC_CONNECT_RESULT_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                g[ru.mail.libverify.p0.a.API_INTERNAL_SILENT_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                g[ru.mail.libverify.p0.a.API_INTERNAL_UNHANDLED_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_START_VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_COMPLETE_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_RESET_VERIFICATION_CODE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_CANCEL_VERIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REQUEST_NEW_SMS_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_CHECK_PHONE_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REQUEST_IVR.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_VERIFY_SMS_CODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATES.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SET_LOCALE.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SET_DISABLE_SIM_DATA_SEND.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SET_API_ENDPOINTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SET_PROXY_ENDPOINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REMOVE_PROXY_ENDPOINT.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SEARCH_PHONE_ACCOUNTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_CHECK_NETWORK.ordinal()] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_RESET.ordinal()] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SIGN_OUT.ordinal()] = 23;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_SOFT_SIGN_OUT.ordinal()] = 24;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_PREPARE_2FA_CHECK.ordinal()] = 25;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION_BY_SMS.ordinal()] = 26;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_REQUEST_GCM_TOKEN.ordinal()] = 27;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_MESSAGE_RECEIVED.ordinal()] = 28;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_SERVER_INFO_RECEIVED.ordinal()] = 29;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_FETCHER_INFO_RECEIVED.ordinal()] = 30;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_TOKEN_UPDATED.ordinal()] = 31;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_TOKEN_UPDATE_FAILED.ordinal()] = 32;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_TOKEN_REFRESHED.ordinal()] = 33;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                g[ru.mail.libverify.p0.a.GCM_NO_GOOGLE_PLAY_SERVICES_INSTALLED.ordinal()] = 34;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                g[ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED.ordinal()] = 35;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CONFIRM.ordinal()] = 36;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CANCEL.ordinal()] = 37;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_SMS_RECEIVED.ordinal()] = 38;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_CALL_RECEIVED.ordinal()] = 39;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_SMS_RETRIEVER_SMS_RECEIVED.ordinal()] = 40;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_FAILED.ordinal()] = 41;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_SUCCEEDED.ordinal()] = 42;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_WAIT_TIMEOUT.ordinal()] = 43;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_IPC_SMS_MESSAGE_RECEIVED.ordinal()] = 44;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_IPC_CANCEL_NOTIFICATION_RECEIVED.ordinal()] = 45;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STARTED_RECEIVED.ordinal()] = 46;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STOPPED_RECEIVED.ordinal()] = 47;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_FETCHER_START_WITH_CHECK.ordinal()] = 48;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.ordinal()] = 49;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_SETTINGS_BATTERY_STATE_CHANGED.ordinal()] = 50;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVICE_SETTINGS_NOTIFICATION_UNBLOCK.ordinal()] = 51;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_SHOWN.ordinal()] = 52;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_REPORT_REUSE.ordinal()] = 53;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_REPORT_SPAM.ordinal()] = 54;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_BLOCK.ordinal()] = 55;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_SHORTCUT_CREATED.ordinal()] = 56;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_OPENED.ordinal()] = 57;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_GET_INFO.ordinal()] = 58;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                g[ru.mail.libverify.p0.a.UI_NOTIFICATION_OPENED.ordinal()] = 59;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_ADDED.ordinal()] = 60;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_CLEARED.ordinal()] = 61;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REMOVED.ordinal()] = 62;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_SMS_REMOVED.ordinal()] = 63;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REQUESTED.ordinal()] = 64;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                g[ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOGS_REQUESTED.ordinal()] = 65;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                g[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_COMPLETED.ordinal()] = 66;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                g[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_REQUEST_SMS_INFO.ordinal()] = 67;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                g[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_STARTED.ordinal()] = 68;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                g[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_COMPLETED.ordinal()] = 69;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                g[ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED.ordinal()] = 70;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                g[ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STARTED.ordinal()] = 71;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                g[ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED.ordinal()] = 72;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                g[ru.mail.libverify.p0.a.FETCHER_MANAGER_MESSAGE_RECEIVED.ordinal()] = 73;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                g[ru.mail.libverify.p0.a.FETCHER_MANAGER_SERVER_INFO_RECEIVED.ordinal()] = 74;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_HANDLE_SERVER_FAILURE.ordinal()] = 75;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFY_API_HANDLE_REQUEST_FAILURE.ordinal()] = 76;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                g[ru.mail.libverify.p0.a.PHONE_NUMBER_CHECKER_NEW_CHECK_STARTED.ordinal()] = 77;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                g[ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_ADDED.ordinal()] = 78;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                g[ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_REMOVED.ordinal()] = 79;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                g[ru.mail.libverify.p0.a.NOTIFICATION_BAR_MANAGER_ONGOING_NOTIFICATION_SHOWN.ordinal()] = 80;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVER_ACTION_RESULT.ordinal()] = 81;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                g[ru.mail.libverify.p0.a.SERVER_ACTION_FAILURE.ordinal()] = 82;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                g[ru.mail.libverify.p0.a.SESSION_CONTAINER_ADDED_SESSION.ordinal()] = 83;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                g[ru.mail.libverify.p0.a.SESSION_CONTAINER_REMOVED_SESSION.ordinal()] = 84;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                g[ru.mail.libverify.p0.a.SAFETY_NET_RESPONE_RECEIVED.ordinal()] = 85;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFICATION_SESSION_STATE_CHANGED.ordinal()] = 86;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFICATION_SESSION_FETCHER_INFO_RECEIVED.ordinal()] = 87;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_EXECUTED.ordinal()] = 88;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_SEND_STATS.ordinal()] = 89;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                g[ru.mail.libverify.p0.a.VERIFICATION_SESSION_MOBILEID_RESULTS_RECEIVED.ordinal()] = 90;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                g[ru.mail.libverify.p0.a.API_SHUTDOWN.ordinal()] = 91;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                g[ru.mail.libverify.p0.a.APP_MOVE_TO_BACKGROUND.ordinal()] = 92;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                g[ru.mail.libverify.p0.a.APP_MOVE_TO_FOREGROUND.ordinal()] = 93;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                g[ru.mail.libverify.p0.a.FEATURE_REPOSITORY_INIT.ordinal()] = 94;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                g[ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT.ordinal()] = 95;
            } catch (NoSuchFieldError unused97) {
            }
            int[] iArr3 = new int[a.f.EnumC2198a.values().length];
            f = iArr3;
            try {
                iArr3[a.f.EnumC2198a.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f[a.f.EnumC2198a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused99) {
            }
            int[] iArr4 = new int[j.a.values().length];
            e = iArr4;
            try {
                iArr4[j.a.PACKAGE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                e[j.a.PACKAGE_REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                e[j.a.RESTART.ordinal()] = 3;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                e[j.a.TIMER.ordinal()] = 4;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                e[j.a.SMS_TEMPLATES_CHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                e[j.a.NOTIFICATION_SETTINGS_CHANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                e[j.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused106) {
            }
            int[] iArr5 = new int[h.values().length];
            d = iArr5;
            try {
                iArr5[h.CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                d[h.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused108) {
            }
            int[] iArr6 = new int[j.c.values().length];
            c = iArr6;
            try {
                iArr6[j.c.GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                c[j.c.FETCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                c[j.c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused111) {
            }
            int[] iArr7 = new int[f.c.values().length];
            b = iArr7;
            try {
                iArr7[f.c.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                b[f.c.READY_SERVICE_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                b[f.c.CONNECTION_TIMEOUT_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                b[f.c.GENERAL_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                b[f.c.FAILED_TO_FIND_READY_SERVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                b[f.c.FAILED_TO_FIND_TARGET_SESSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused117) {
            }
            int[] iArr8 = new int[b.a.c.values().length];
            a = iArr8;
            try {
                iArr8[b.a.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[b.a.c.PING.ordinal()] = 2;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[b.a.c.PING_V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                a[b.a.c.VERIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                a[b.a.c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused122) {
            }
        }
    }

    public class d implements ru.mail.libverify.c.b {
        public /* synthetic */ d(q qVar, int i) {
            this();
        }

        @Override // ru.mail.libverify.c.b
        @NonNull
        public final MessageBus a() {
            return q.this.q;
        }

        @Override // ru.mail.libverify.c.b
        @NonNull
        public final ru.mail.libverify.p0.b b() {
            return q.this.p.b();
        }

        @Override // ru.mail.libverify.c.b
        @NonNull
        public final KeyValueStorage c() {
            return q.this.a.c();
        }

        @Override // ru.mail.libverify.c.b
        @NonNull
        public final ExecutorService d() {
            return q.this.p.d();
        }

        @Override // ru.mail.libverify.c.b
        @NonNull
        public final ru.mail.libverify.u.w e() {
            return q.this.a;
        }

        private d() {
        }
    }

    public class e extends d {
        public /* synthetic */ e(q qVar, int i) {
            this(qVar);
        }

        private e(q qVar) {
            super(qVar, 0);
        }
    }

    public class f implements ru.mail.libverify.f.d {
        private volatile ThreadPoolExecutor a;
        private volatile ThreadPoolExecutor b;

        public class a implements ThreadFactory {
            public a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            @NonNull
            public final Thread newThread(@NonNull Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("libverify_fetcher_connection");
                thread.setUncaughtExceptionHandler(q.this.w);
                return thread;
            }
        }

        public class b implements ThreadFactory {
            public b() {
            }

            @Override // java.util.concurrent.ThreadFactory
            @NonNull
            public final Thread newThread(@NonNull Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("libverify_fetcher_worker");
                thread.setUncaughtExceptionHandler(q.this.w);
                return thread;
            }
        }

        public /* synthetic */ f(q qVar, int i) {
            this();
        }

        @Override // ru.mail.libverify.f.d
        public final boolean a() {
            return q.this.b.b();
        }

        @Override // ru.mail.libverify.f.d
        @NonNull
        public final ExecutorService b() {
            if (this.a == null) {
                synchronized (this) {
                    try {
                        if (this.a == null) {
                            this.a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), q.this.x);
                        }
                    } finally {
                    }
                }
            }
            return this.a;
        }

        @Override // ru.mail.libverify.f.d
        @NonNull
        public final ExecutorService c() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), q.this.x);
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }

        private f() {
        }
    }

    public class g {
        public /* synthetic */ g(q qVar, int i) {
            this();
        }

        @NonNull
        public final s a(@NonNull String str) throws JsonParseException {
            q qVar = q.this;
            if (qVar.C == null) {
                qVar.C = new ru.mail.libverify.n.m(qVar.m);
            }
            ru.mail.libverify.n.m mVar = qVar.C;
            q qVar2 = q.this;
            if (qVar2.D == null) {
                qVar2.D = new ru.mail.libverify.n.h(qVar2.m, qVar2.f);
            }
            ru.mail.libverify.n.h hVar = qVar2.D;
            q qVar3 = q.this;
            if (qVar3.E == null) {
                qVar3.E = new ru.mail.libverify.b0.a(qVar3.m);
            }
            ru.mail.libverify.b0.a aVar = qVar3.E;
            q qVar4 = q.this;
            return new s(mVar, hVar, aVar, qVar4.u, qVar4.m, str, qVar4.t, qVar4.f);
        }

        private g() {
        }
    }

    public enum h {
        ACTUAL,
        CHANGED,
        UPDATING
    }

    public q(@NonNull ru.mail.libverify.g0.d dVar, @NonNull ru.mail.libverify.u.w wVar, @NonNull MessageBus messageBus, @NonNull ru.mail.libverify.c.g gVar, @NonNull bqy<ru.mail.libverify.g0.a> bqyVar, @NonNull bqy<ru.mail.libverify.h0.a> bqyVar2, @NonNull bqy<ru.mail.libverify.j0.b> bqyVar3, @NonNull bqy<ru.mail.libverify.o.d> bqyVar4, @NonNull bqy<ru.mail.libverify.i.c> bqyVar5, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull RejectedExecutionHandler rejectedExecutionHandler, @NonNull ru.mail.libverify.m0.a aVar, @NonNull ru.mail.libverify.y.a aVar2, @NonNull ru.mail.libverify.i0.a aVar3, @NonNull ru.mail.libverify.b.b bVar, @NonNull ru.mail.libverify.o.e eVar) {
        int i = 0;
        this.l = new f(this, i);
        d dVar2 = new d(this, i);
        this.m = dVar2;
        this.n = new AtomicReference<>();
        this.H = new ru.mail.libverify.z.d();
        this.J = new AtomicReference<>(null);
        this.L = new ConcurrentHashMap<>();
        ru.mail.libverify.n0.b.a(bqyVar4);
        this.K = eVar;
        this.p = dVar;
        this.q = messageBus;
        this.r = gVar;
        this.s = bqyVar;
        this.v = bqyVar2;
        this.w = uncaughtExceptionHandler;
        this.x = rejectedExecutionHandler;
        this.y = bqyVar5;
        this.z = bqyVar3;
        this.t = aVar;
        this.B = bVar;
        this.u = aVar3;
        this.a = wVar;
        bqyVar5.get().b();
        this.f = new ru.mail.libverify.o.b(aVar3, bqyVar4);
        this.g = new n(new e(this, i));
        this.b = new o(dVar2, new g(this, i));
        this.i = c6o.a(new d9e0() { // from class: xsna.p9z0
            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.api.e l;
                l = ru.mail.libverify.api.q.this.l();
                return l;
            }
        });
        this.h = c6o.a(new d9e0() { // from class: xsna.q9z0
            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.f.c m;
                m = ru.mail.libverify.api.q.this.m();
                return m;
            }
        });
        this.j = c6o.a(new d9e0() { // from class: xsna.r9z0
            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.api.g n;
                n = ru.mail.libverify.api.q.this.n();
                return n;
            }
        });
        this.o = new ru.mail.libverify.x.e(dVar2, uncaughtExceptionHandler);
        this.G = new ru.mail.libverify.u.z(wVar);
        this.A = new ru.mail.libverify.u.y(dVar2);
        aVar2.a();
        this.I = new a(dVar, aVar3);
        dVar.a(this);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void addSmsCodeNotificationListener(@NonNull VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        this.p.b().post(new hc3(13, this, smsCodeNotificationListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void addSmsDialogChangedListener(@NonNull VerificationApi.SmsDialogChangedListener smsDialogChangedListener) {
        this.o.a(smsDialogChangedListener);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void addVerificationStateChangedListener(@NonNull VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        this.p.b().post(new eo1(10, this, verificationStateChangedListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void cancelVerification(@NonNull String str) {
        cancelVerification(str, VerificationApi.CancelReason.OK);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void checkAccountVerification(@NonNull String str) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION, str));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void checkAccountVerificationBySms(@NonNull String str, @Nullable VerificationApi.AccountCheckListener accountCheckListener) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION_BY_SMS, str, accountCheckListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void checkPhoneNumber(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull VerificationApi.PhoneCheckListener phoneCheckListener) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_CHECK_PHONE_NUMBER, str, str2, str3, Boolean.valueOf(z), phoneCheckListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void clearSmsDialogs() {
        this.o.h();
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void completeVerification(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            FileLog.e("VerificationApi", "sessionId must be not null");
        } else {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_COMPLETE_VERIFICATION, str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        s a2;
        s a3;
        ru.mail.libverify.p0.a a4 = ru.mail.libverify.p0.e.a(message, "VerificationApi", e.b.NORMAL);
        r5 = null;
        Long l = null;
        ru.mail.libverify.i.j jVar = null;
        ru.mail.libverify.i.j jVar2 = null;
        r5 = null;
        Long l2 = null;
        r5 = null;
        Long l3 = null;
        boolean z = true;
        boolean z2 = false;
        z2 = false;
        switch (c.g[a4.ordinal()]) {
            case 1:
                ru.mail.libverify.g.b bVar = (ru.mail.libverify.g.b) ru.mail.libverify.p0.e.b(message, 0);
                a(bVar, ((Boolean) ru.mail.libverify.p0.e.b(message, 2)).booleanValue(), (f.c) ru.mail.libverify.p0.e.b(message, 3));
                return true;
            case 2:
                this.f.b((Throwable) ((Pair) ru.mail.libverify.p0.e.a(message)).second);
                return true;
            case 3:
                this.f.a((Throwable) ((Pair) ru.mail.libverify.p0.e.a(message)).second);
                return true;
            case 4:
                b((s) ru.mail.libverify.p0.e.a(message));
                return true;
            case 5:
                String str = (String) ru.mail.libverify.p0.e.a(message);
                s c2 = this.b.c(str);
                this.H.a(str);
                if (c2 != null) {
                    this.f.e(c2);
                    return true;
                }
                this.f.e(str);
                return true;
            case 6:
                s a5 = this.b.a((String) ru.mail.libverify.p0.e.a(message), o.b.NOT_TEMPORARY);
                if (a5 == null) {
                    return true;
                }
                a5.J();
                return true;
            case 7:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (VerificationApi.CancelReason) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 8:
                f((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 9:
                e().a((String) ru.mail.libverify.p0.e.b(message, 0), (String) ru.mail.libverify.p0.e.b(message, 1), (String) ru.mail.libverify.p0.e.b(message, 2), ((Boolean) ru.mail.libverify.p0.e.b(message, 3)).booleanValue(), (VerificationApi.PhoneCheckListener) ru.mail.libverify.p0.e.b(message, 4));
                return true;
            case 10:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (VerificationApi.IvrStateListener) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 11:
                b((String) ru.mail.libverify.p0.e.b(message, 0), (String) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 12:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (VerificationApi.VerificationStateChangedListener) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 13:
                ((VerificationApi.VerificationStatesHandler) ru.mail.libverify.p0.e.a(message)).onExistingVerificationsFound(this.b.a(o.b.NOT_TEMPORARY));
                return true;
            case 14:
                this.f.b();
                String str2 = (String) ru.mail.libverify.p0.e.a(message);
                ru.mail.libverify.j0.b bVar2 = this.z.get();
                ru.mail.libverify.u.w wVar = this.a;
                ru.mail.libverify.j0.n.a(bVar2, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.b(str2, wVar.C().c())));
                return true;
            case 15:
                a((Locale) ru.mail.libverify.p0.e.a(message));
                return true;
            case 16:
                g(((Boolean) ru.mail.libverify.p0.e.a(message)).booleanValue());
                return true;
            case 17:
                if (this.a.setApiEndpoints(ru.mail.libverify.p0.e.b(message))) {
                    this.f.k();
                }
                this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT, new Object[0]));
                return true;
            case 18:
                this.a.c((String) ru.mail.libverify.p0.e.a(message));
                this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT, new Object[0]));
                return true;
            case 19:
                this.a.j();
                this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT, new Object[0]));
                return true;
            case 20:
                b((VerificationApi.PhoneAccountSearchListener) ru.mail.libverify.p0.e.a(message));
                return true;
            case 21:
                if (!((Boolean) ru.mail.libverify.p0.e.a(message)).booleanValue()) {
                    return true;
                }
                this.a.D().e();
                return true;
            case 22:
                f(true);
                this.f.e();
                return true;
            case 23:
                a(((Boolean) ru.mail.libverify.p0.e.b(message, 0)).booleanValue(), (SignOutCallback) ru.mail.libverify.p0.e.c(message, 1));
                return true;
            case 24:
                Object obj = message.obj;
                a((SignOutCallback) (obj != null ? obj : null));
                return true;
            case 25:
                e(true);
                return true;
            case 26:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (VerificationApi.AccountCheckListener) ru.mail.libverify.p0.e.c(message, 1));
                return true;
            case 27:
                this.e.add((VerificationApi.GcmTokenListener) ru.mail.libverify.p0.e.a(message));
                h q = q();
                FileLog.v("VerificationApi", "push token requested from an application (%s)", q);
                a(q);
                return true;
            case 28:
                if (!this.r.c().equals((String) ru.mail.libverify.p0.e.b(message, 0))) {
                    return true;
                }
                c((String) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 29:
                if (!this.r.c().equals((String) ru.mail.libverify.p0.e.b(message, 0))) {
                    return true;
                }
                e((String) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 30:
                if (!this.r.c().equals((String) ru.mail.libverify.p0.e.b(message, 0))) {
                    return true;
                }
                d((String) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 31:
                a(q());
                return true;
            case 32:
                Throwable th = (Throwable) ru.mail.libverify.p0.e.b(message, 0);
                Boolean bool = (Boolean) ru.mail.libverify.p0.e.b(message, 1);
                boolean booleanValue = bool.booleanValue();
                FileLog.e("VerificationApi", th, "Failed to update push token (max attempt: %s)", bool);
                if (booleanValue) {
                    this.f.j();
                    return true;
                }
                this.f.h();
                return true;
            case 33:
                return z;
            case 34:
                g();
                return true;
            case 35:
                c(((Boolean) ru.mail.libverify.p0.e.a(message)).booleanValue());
                return true;
            case 36:
                b((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 37:
                a((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 38:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (String) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 39:
                String str3 = (String) message.obj;
                Iterator it = this.b.g().iterator();
                while (it.hasNext()) {
                    ((s) it.next()).g(str3);
                }
                return true;
            case 40:
                int intValue = ((Integer) ru.mail.libverify.p0.e.b(message, 0)).intValue();
                String str4 = (String) ru.mail.libverify.p0.e.b(message, 1);
                if (this.E == null) {
                    this.E = new ru.mail.libverify.b0.a(this.m);
                }
                this.E.onSmsRetrieverSmsReceived(intValue, str4);
                return true;
            case 41:
                this.f.l();
                return true;
            case 42:
                this.f.m();
                return true;
            case 43:
                this.f.n();
                return true;
            case 44:
                String str5 = (String) ru.mail.libverify.p0.e.b(message, 0);
                String str6 = (String) ru.mail.libverify.p0.e.b(message, 1);
                Iterator it2 = this.b.g().iterator();
                while (it2.hasNext()) {
                    s sVar = (s) it2.next();
                    if (TextUtils.equals(ru.mail.libverify.n0.e.f(sVar.h()), str5)) {
                        sVar.b(str6, true);
                        return true;
                    }
                }
                FileLog.e("VerificationApi", "failed to find target session for ipc message");
                return true;
            case 45:
                a((String) ru.mail.libverify.p0.e.b(message, 0), ((Long) ru.mail.libverify.p0.e.b(message, 1)).longValue());
                return true;
            case 46:
            case 47:
                String str7 = (String) ru.mail.libverify.p0.e.a(message);
                if (!this.a.d("instance_single_fetcher") || this.b.b()) {
                    FileLog.d("VerificationApi", "fetcher communication disabled");
                    return true;
                }
                if (a4 == ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STOPPED_RECEIVED) {
                    this.h.get().b(str7);
                    return true;
                }
                this.h.get().a(str7);
                return true;
            case 48:
                this.h.get().h();
                return true;
            case 49:
                switch (c.e[j.a.valueOf(((Bundle) ru.mail.libverify.p0.e.a(message)).getString("settings_action_type")).ordinal()]) {
                    case 1:
                    case 2:
                        if (this.a.d("instance_track_package")) {
                            Long longValue = this.a.c().getLongValue("api_settings_timestamp", null);
                            if (longValue != null) {
                                long b2 = this.u.b() - longValue.longValue();
                                if (b2 >= 0) {
                                    l3 = Long.valueOf(b2);
                                }
                            }
                            FileLog.d("VerificationApi", "elapsed time since the last settings check %s", l3);
                            if (l3 == null || l3.longValue() >= TimeUtils.MILLISECONDS_PER_DAY) {
                                ru.mail.libverify.j0.b bVar3 = this.z.get();
                                ru.mail.libverify.u.w wVar2 = this.a;
                                ru.mail.libverify.j0.n.a(bVar3, new ru.mail.libverify.requests.l(wVar2, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.CHECK_SETTINGS_PACKAGES_CHANGED, wVar2.C().c())));
                                return true;
                            }
                            return true;
                        }
                        z = true;
                        return z;
                    case 3:
                        Long longValue2 = this.a.c().getLongValue("api_settings_timestamp", null);
                        if (longValue2 != null) {
                            long b3 = this.u.b() - longValue2.longValue();
                            if (b3 >= 0) {
                                l2 = Long.valueOf(b3);
                            }
                        }
                        FileLog.d("VerificationApi", "elapsed time since the last settings check %s", l2);
                        if (l2 == null || l2.longValue() >= TimeUtils.MILLISECONDS_PER_DAY) {
                            ru.mail.libverify.j0.b bVar4 = this.z.get();
                            ru.mail.libverify.u.w wVar3 = this.a;
                            ru.mail.libverify.j0.n.a(bVar4, new ru.mail.libverify.requests.l(wVar3, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.CHECK_SETTINGS_RESTART, wVar3.C().c())));
                            return true;
                        }
                        return true;
                    case 4:
                        ru.mail.libverify.j0.b bVar5 = this.z.get();
                        ru.mail.libverify.u.w wVar4 = this.a;
                        ru.mail.libverify.l.b bVar6 = ru.mail.libverify.l.b.CHECK_SETTINGS_TIMER;
                        String c3 = wVar4.C().c();
                        ru.mail.libverify.i.j a6 = ru.mail.libverify.i.i.a(wVar4.getContext());
                        String value = wVar4.c().getValue("settings_notify_permissions_key");
                        String f2 = ru.mail.libverify.q0.a.f(a6);
                        if (!TextUtils.equals(value, f2)) {
                            FileLog.d("VerificationApi", "Push permissions changed: %s -> %s", value, f2);
                            jVar2 = a6;
                        }
                        ru.mail.libverify.j0.n.a(bVar5, new ru.mail.libverify.requests.l(wVar4, ru.mail.libverify.l.c.a(bVar6, c3, jVar2)));
                        return true;
                    case 5:
                        if (!this.a.d("instance_intercept_sms")) {
                            this.a.a((ru.mail.libverify.m.m) null);
                            return true;
                        }
                        if (!this.a.f()) {
                            ru.mail.libverify.j0.b bVar7 = this.z.get();
                            ru.mail.libverify.u.w wVar5 = this.a;
                            ru.mail.libverify.j0.n.a(bVar7, new ru.mail.libverify.requests.l(wVar5, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REQUEST_SMS_INFO, wVar5.C().c())));
                            return true;
                        }
                        z = true;
                        return z;
                    case 6:
                        ru.mail.libverify.u.w wVar6 = this.a;
                        ru.mail.libverify.i.j a7 = ru.mail.libverify.i.i.a(wVar6.getContext());
                        String value2 = wVar6.c().getValue("settings_notify_permissions_key");
                        String f3 = ru.mail.libverify.q0.a.f(a7);
                        if (!TextUtils.equals(value2, f3)) {
                            FileLog.d("VerificationApi", "Push permissions changed: %s -> %s", value2, f3);
                            jVar = a7;
                        }
                        if (jVar != null) {
                            ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.a(jVar)));
                            return true;
                        }
                        return true;
                    case 7:
                        Long longValue3 = this.a.c().getLongValue("api_settings_timestamp", null);
                        if (longValue3 != null) {
                            long b4 = this.u.b() - longValue3.longValue();
                            if (b4 >= 0) {
                                l = Long.valueOf(b4);
                            }
                        }
                        FileLog.d("VerificationApi", "elapsed time since the last settings check %s", l);
                        if (l == null || l.longValue() >= TimeUtils.MILLISECONDS_PER_DAY) {
                            ru.mail.libverify.j0.b bVar8 = this.z.get();
                            ru.mail.libverify.u.w wVar7 = this.a;
                            ru.mail.libverify.j0.n.a(bVar8, new ru.mail.libverify.requests.l(wVar7, ru.mail.libverify.l.c.a(wVar7.C().c())));
                            return true;
                        }
                        return true;
                    default:
                        throw new IllegalArgumentException("Illegal action type provided");
                }
            case 50:
                boolean z3 = ((Bundle) ru.mail.libverify.p0.e.a(message)).getBoolean("battery_level_low");
                if (this.b.b()) {
                    FileLog.d("VerificationApi", "fetcher state change blocked by active sessions");
                    return true;
                }
                if (z3) {
                    this.h.get().n();
                    return true;
                }
                this.h.get().p();
                return true;
            case 51:
                String string = ((Bundle) ru.mail.libverify.p0.e.a(message)).getString("notification_id");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                ru.mail.libverify.g.b a8 = this.g.a(string);
                if (a8 == null) {
                    FileLog.e("VerificationApi", "notification id %s doesn't exist", string);
                    return true;
                }
                this.y.get().a(new ru.mail.libverify.i.k(this.a.getContext(), a8, true));
                return true;
            case 52:
                String str8 = (String) ru.mail.libverify.p0.e.a(message);
                ru.mail.libverify.g.b a9 = this.g.a(str8);
                if (a9 == null) {
                    FileLog.e("VerificationApi", "notification id %s doesn't exist", str8);
                    return true;
                }
                FileLog.v("VerificationApi", "notification %s show settings", a9);
                this.y.get().a(new ru.mail.libverify.i.k(this.a.getContext(), a9, true));
                this.f.e(a9);
                return true;
            case 53:
                String str9 = (String) ru.mail.libverify.p0.e.a(message);
                ru.mail.libverify.g.b b5 = this.g.b(str9);
                if (b5 == null) {
                    FileLog.e("VerificationApi", "notification id %s doesn't exist", str9);
                    return true;
                }
                FileLog.v("VerificationApi", "notification %s execute report reuse", b5);
                ru.mail.libverify.j0.b bVar9 = this.z.get();
                ru.mail.libverify.u.w wVar8 = this.a;
                ru.mail.libverify.j0.n.a(bVar9, new ru.mail.libverify.requests.l(wVar8, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REPORT_PHONE_NUMBER_REUSE, wVar8.C().c())));
                this.y.get().a(str9);
                this.f.h(b5);
                return true;
            case 54:
                String str10 = (String) ru.mail.libverify.p0.e.a(message);
                ru.mail.libverify.g.b b6 = this.g.b(str10);
                if (b6 == null) {
                    FileLog.e("VerificationApi", "notification with id %s doesn't exist", str10);
                    return true;
                }
                FileLog.v("VerificationApi", "notification %s execute report spam", b6);
                String e2 = b6.e().e();
                ru.mail.libverify.j0.b bVar10 = this.z.get();
                ru.mail.libverify.u.w wVar9 = this.a;
                ru.mail.libverify.j0.n.a(bVar10, new ru.mail.libverify.requests.l(wVar9, ru.mail.libverify.l.c.c(e2, wVar9.C().c())));
                this.y.get().a(str10);
                return true;
            case 55:
                String str11 = (String) ru.mail.libverify.p0.e.b(message, 0);
                Integer num = (Integer) ru.mail.libverify.p0.e.b(message, 1);
                int intValue2 = num.intValue();
                ru.mail.libverify.g.b a10 = this.g.a(str11);
                if (a10 == null) {
                    FileLog.e("VerificationApi", "notification with id %s doesn't exist", str11);
                    return true;
                }
                FileLog.v("VerificationApi", "notification %s execute block push for %d", a10, num);
                String e3 = a10.e().e();
                ru.mail.libverify.j0.b bVar11 = this.z.get();
                ru.mail.libverify.u.w wVar10 = this.a;
                ru.mail.libverify.j0.n.a(bVar11, new ru.mail.libverify.requests.l(wVar10, ru.mail.libverify.l.c.a(e3, intValue2, wVar10.C().c())));
                this.y.get().a(str11);
                this.f.i(a10);
                return true;
            case 56:
                this.f.a(((Boolean) ru.mail.libverify.p0.e.a(message)).booleanValue());
                return true;
            case 57:
                ru.mail.libverify.o.b bVar12 = this.f;
                Object obj2 = message.obj;
                bVar12.c((String) (obj2 != null ? obj2 : null));
                return true;
            case 58:
                String str12 = (String) ru.mail.libverify.p0.e.c(message, 0);
                j.c cVar = (j.c) ru.mail.libverify.p0.e.c(message, 1);
                ru.mail.libverify.g.b a11 = this.g.a(str12);
                if (a11 == null) {
                    FileLog.e("VerificationApi", "notification with id %s doesn't exist", str12);
                    cVar.a(null);
                    return true;
                }
                boolean z4 = this.a.d("instance_add_shortcut") && this.a.c().getValue("api_has_shortcut") == null;
                if (z4) {
                    this.a.c().putValue("api_has_shortcut", Boolean.toString(true)).commitSync();
                }
                boolean d2 = this.a.d("instance_write_history");
                b.a e4 = a11.e();
                cVar.a(new j.b(a11.c(), e4.n(), e4.h(), e4.e(), a11.a().toString(), e4.b(), Boolean.valueOf(e4.r()), e4.c(), e4.m(), d2, z4));
                return true;
            case 59:
                String str13 = (String) ru.mail.libverify.p0.e.a(message);
                ru.mail.libverify.g.b a12 = this.g.a(str13);
                if (a12 == null) {
                    FileLog.e("VerificationApi", "notification with id %s doesn't exist", str13);
                    return true;
                }
                FileLog.v("VerificationApi", "notification %s opened notification popup", a12);
                this.y.get().a(new ru.mail.libverify.i.k(this.a.getContext(), a12, true));
                this.f.d(a12);
                return true;
            case 60:
                this.f.b((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 61:
                this.f.a(b.EnumC2211b.ALL, (String) null);
                return true;
            case 62:
                this.f.a(b.EnumC2211b.SMS_DIALOG, (String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 63:
                this.f.a(b.EnumC2211b.SMS, (String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 64:
                this.f.d((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case 65:
                this.f.d((String) null);
                return true;
            case 66:
                String str14 = (String) ru.mail.libverify.p0.e.b(message, 0);
                String str15 = (String) ru.mail.libverify.p0.e.b(message, 1);
                VerificationApi.AccountCheckResult accountCheckResult = (VerificationApi.AccountCheckResult) ru.mail.libverify.p0.e.b(message, 2);
                FileLog.v("VerificationApi", "account check completed with result %s for %s", accountCheckResult, str14);
                ru.mail.libverify.j0.b bVar13 = this.z.get();
                ru.mail.libverify.u.w wVar11 = this.a;
                ru.mail.libverify.j0.n.a(bVar13, new ru.mail.libverify.requests.l(wVar11, ru.mail.libverify.l.c.c(str14, str15, wVar11.C().c())));
                ru.mail.libverify.o.b bVar14 = this.f;
                if (accountCheckResult == VerificationApi.AccountCheckResult.OK && !TextUtils.isEmpty(str15)) {
                    z2 = true;
                }
                bVar14.a(accountCheckResult, z2);
                if (this.a.d("instance_safety_net")) {
                    this.j.get().h();
                    return true;
                }
                return true;
            case 67:
                e(false);
                return true;
            case 68:
                this.a.a(this, false, 0);
                return true;
            case 69:
                this.a.a(this);
                return true;
            case 70:
                String str16 = (String) ru.mail.libverify.p0.e.c(message, 0);
                this.f.a(((ru.mail.libverify.api.f) ru.mail.libverify.p0.e.b(message, 1)).toString());
                if (!TextUtils.isEmpty(str16)) {
                    ru.mail.libverify.j0.b bVar15 = this.z.get();
                    ru.mail.libverify.u.w wVar12 = this.a;
                    ru.mail.libverify.j0.n.a(bVar15, new ru.mail.libverify.requests.l(wVar12, ru.mail.libverify.l.c.a(str16, wVar12.C().c())));
                    return true;
                }
                return true;
            case 71:
                Boolean bool2 = (Boolean) ru.mail.libverify.p0.e.a(message);
                boolean booleanValue2 = bool2.booleanValue();
                FileLog.d("VerificationApi", "fetcher started, publish = %s", bool2);
                this.a.o();
                if (!booleanValue2 || this.b.b()) {
                    FileLog.d("VerificationApi", "fetcher started, didn't published");
                    return true;
                }
                d(true);
                this.f.c();
                return true;
            case 72:
                Boolean bool3 = (Boolean) ru.mail.libverify.p0.e.a(message);
                boolean booleanValue3 = bool3.booleanValue();
                FileLog.d("VerificationApi", "fetcher stopped, publish = %s", bool3);
                this.a.a(booleanValue3);
                if (!booleanValue3 || this.b.b()) {
                    FileLog.d("VerificationApi", "fetcher started, didn't published");
                    return true;
                }
                d(false);
                this.f.d();
                return true;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                String str17 = (String) ru.mail.libverify.p0.e.a(message);
                FileLog.v("VerificationApi", "received message from fetcher: %s", str17);
                try {
                    for (ru.mail.libverify.g.b bVar16 : (ru.mail.libverify.g.b[]) ru.mail.libverify.q0.a.a(str17, ru.mail.libverify.g.b[].class)) {
                        bVar16.a(j.c.FETCHER);
                        f(bVar16);
                    }
                } catch (JsonParseException e5) {
                    ru.mail.libverify.n0.b.a("VerificationApi", "failed to parse fetcher json", e5);
                }
                return true;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                a((ru.mail.libverify.g.a) ru.mail.libverify.p0.e.a(message), j.c.FETCHER);
                return true;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                a((ru.mail.libverify.requests.c<?, ?>) ru.mail.libverify.p0.e.b(message, 0), (Throwable) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                this.f.a((ru.mail.libverify.m.c<?, ?>) ru.mail.libverify.p0.e.a(message));
                return true;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                this.f.g();
                return true;
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                this.a.a((ru.mail.libverify.g.b) ru.mail.libverify.p0.e.a(message), false, 12);
                return true;
            case 79:
                this.a.a((ru.mail.libverify.g.b) ru.mail.libverify.p0.e.a(message));
                return true;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                String str18 = (String) ru.mail.libverify.p0.e.b(message, 0);
                Long l4 = (Long) ru.mail.libverify.p0.e.b(message, 1);
                if (this.g.a(str18) == null) {
                    FileLog.e("VerificationApi", "notification with id %s doesn't exist", str18);
                    return true;
                }
                this.s.get().a().a(ru.mail.libverify.p0.a.SERVICE_SETTINGS_NOTIFICATION_UNBLOCK.name()).a("notification_id", str18).a(l4.longValue()).a().c();
                return true;
            case IMAGES_IMAGE_LOADED_VALUE:
                ru.mail.libverify.k0.a aVar = (ru.mail.libverify.k0.a) ru.mail.libverify.p0.e.a(message);
                if (!(aVar instanceof ru.mail.libverify.m.c)) {
                    return true;
                }
                a((ru.mail.libverify.m.c<?, ?>) aVar);
                return true;
            case 82:
                ru.mail.libverify.j0.k kVar = (ru.mail.libverify.j0.k) ru.mail.libverify.p0.e.b(message, 0);
                if (!(kVar instanceof ru.mail.libverify.requests.c)) {
                    return true;
                }
                a((ru.mail.libverify.requests.c<?, ?>) kVar, (Throwable) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 83:
                this.a.a((s) ru.mail.libverify.p0.e.a(message), true, 13);
                return true;
            case 84:
                s sVar2 = (s) ru.mail.libverify.p0.e.a(message);
                this.a.a(sVar2);
                if (!sVar2.m().completedSuccessfully()) {
                    this.h.get().o();
                    return true;
                }
                if (this.a.d("instance_safety_net")) {
                    this.j.get().h();
                }
                this.h.get().h();
                return true;
            case 85:
                this.j.get().a((String) ru.mail.libverify.p0.e.a(message));
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                a((String) ru.mail.libverify.p0.e.b(message, 0), (VerificationApi.VerificationStateDescriptor) ru.mail.libverify.p0.e.b(message, 1));
                return true;
            case 87:
                ru.mail.libverify.f.c cVar2 = this.h.get();
                Object obj3 = message.obj;
                cVar2.b((ru.mail.libverify.m.f) (obj3 != null ? obj3 : null));
                return true;
            case 88:
                String str19 = (String) ru.mail.libverify.p0.e.c(message, 0);
                String str20 = (String) ru.mail.libverify.p0.e.c(message, 1);
                if (str19 != null && str20 != null && (a2 = this.b.a(str19, o.b.ALL)) != null) {
                    this.f.b(a2);
                    ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.a(str20, str19, q.this.a.C().c()), null));
                    return true;
                }
                return true;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                String str21 = (String) ru.mail.libverify.p0.e.c(message, 0);
                if (str21 != null) {
                    FileLog.v("VerificationApi", "request call to call_in number for %s", str21);
                    s a13 = this.b.a(str21, o.b.NOT_TEMPORARY);
                    if (a13 == null) {
                        FileLog.e("VerificationApi", "Session with id %s not found", str21);
                        return true;
                    }
                    VerificationApi.CallInDescriptor callInDescriptor = a13.m().getCallInDescriptor();
                    if (callInDescriptor == null) {
                        FileLog.e("VerificationApi", "Session doesn't have a call_in in the descriptor");
                        return true;
                    }
                    String phoneNumber = callInDescriptor.getPhoneNumber();
                    s a14 = this.b.a(str21, o.b.ALL);
                    if (a14 != null) {
                        this.f.a(a14);
                        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.b(phoneNumber, str21, q.this.a.C().c()), null));
                        return true;
                    }
                }
                return true;
            case 90:
                String str22 = (String) ru.mail.libverify.p0.e.c(message, 0);
                Integer num2 = (Integer) ru.mail.libverify.p0.e.c(message, 1);
                if (str22 != null && num2 != null && (a3 = this.b.a(str22, o.b.ALL)) != null) {
                    ArrayList<ru.mail.libverify.d.b> i = a3.i();
                    ru.mail.libverify.l.c a15 = ru.mail.libverify.l.c.a(i, str22, q.this.a.C().c());
                    FileLog.d("MOBILE_ID_ROUTES", "send libverifysettings: " + i);
                    if (num2.intValue() != 200) {
                        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, a15));
                        return true;
                    }
                    Network network = ru.mail.libverify.j0.g.a().get();
                    FileLog.d("ConnectivityHelper", "Result of cellular request: %s", network != null ? network.toString() : null);
                    if (network == null) {
                        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.a(a15, i), null));
                        return true;
                    }
                    try {
                        new ru.mail.libverify.requests.l(this.a, a15, network).b();
                        FileLog.d("VerificationApi", "Request executed over cellular.");
                        return true;
                    } catch (Throwable unused) {
                        FileLog.d("VerificationApi", "Failed to execute request over cellular.");
                        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.a(a15, i)));
                    }
                }
                return true;
            case JsonToken.BEGIN_ARRAY /* 91 */:
                ru.mail.libverify.j0.g.a(this.a.getId());
                new Handler(this.a.getContext().getMainLooper()).post(new gs2(this, 21));
                return true;
            case 92:
                if (this.b.b()) {
                    Long k = this.h.get().k();
                    String j = this.h.get().j();
                    if (k != null) {
                        this.a.c().putValue("settings_fetcher_timestamp_key", k.longValue()).commit();
                    } else {
                        this.a.c().removeValue("settings_fetcher_timestamp_key");
                    }
                    if (j != null) {
                        this.a.c().putValue("settings_fetcher_etag_key", j).commit();
                    } else {
                        this.a.c().removeValue("settings_fetcher_etag_key");
                    }
                    this.h.get().n();
                    return true;
                }
                return z;
            case JsonToken.END_ARRAY /* 93 */:
                ru.mail.libverify.u.w wVar13 = this.a;
                ru.mail.libverify.i.j a16 = ru.mail.libverify.i.i.a(wVar13.getContext());
                String value3 = wVar13.c().getValue("settings_notify_permissions_key");
                String f4 = ru.mail.libverify.q0.a.f(a16);
                if (TextUtils.equals(value3, f4)) {
                    a16 = null;
                } else {
                    FileLog.d("VerificationApi", "Push permissions changed: %s -> %s", value3, f4);
                }
                if (a16 != null) {
                    ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.l(this.a, ru.mail.libverify.l.c.a(a16)));
                }
                if (this.b.b()) {
                    Long longValue4 = this.a.c().getLongValue("settings_fetcher_timestamp_key", null);
                    String value4 = this.a.c().getValue("settings_fetcher_etag_key");
                    if (longValue4 != null) {
                        this.h.get().a(longValue4);
                    }
                    if (value4 != null) {
                        this.h.get().c(value4);
                    }
                    this.h.get().h();
                    SmsRetrieverService.resendState();
                    return true;
                }
                return z;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                this.K.a();
                return true;
            case 95:
                this.K.c();
                return true;
            default:
                FileLog.e("VerificationApi", "message %s is not supported", a4);
                return false;
        }
    }

    @Override // ru.mail.libverify.api.VerificationApi
    @NonNull
    public final String loggedInWithVKConnect(@NonNull String str, @Nullable String str2) throws IllegalStateException {
        return a(new ru.mail.libverify.e.f(str, ru.mail.libverify.e.g.b(), null, null, null, str2, null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void prepare2StepAuthCheck() {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_PREPARE_2FA_CHECK, (Object) null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void querySms(@Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num, @NonNull VerificationApi.SmsListener smsListener) {
        this.o.a(str, l, l2, num, smsListener);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void querySmsDialogs(@NonNull VerificationApi.SmsDialogsListener smsDialogsListener) {
        this.o.a(smsDialogsListener);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeApiEndpoint() {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REMOVE_PROXY_ENDPOINT, (Object) null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeSms(@NonNull String str, @Nullable Long l, long j) {
        this.o.a(str, l, j);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeSmsCodeNotificationListener(@NonNull VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        this.p.b().post(new gq4(9, this, smsCodeNotificationListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeSmsDialog(@Nullable String str, @Nullable Long l) {
        this.o.b(str, l);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeSmsDialogChangedListener(@NonNull VerificationApi.SmsDialogChangedListener smsDialogChangedListener) {
        this.o.b(smsDialogChangedListener);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void removeVerificationStateChangedListener(@NonNull VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        this.p.b().post(new xsna.z(9, this, verificationStateChangedListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void reportNetworkStateChange(boolean z) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_CHECK_NETWORK, Boolean.valueOf(z)));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void requestGcmToken(@NonNull VerificationApi.GcmTokenListener gcmTokenListener) {
        this.q.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REQUEST_GCM_TOKEN, gcmTokenListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void requestIvrPhoneCall(@NonNull String str, @NonNull VerificationApi.IvrStateListener ivrStateListener) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REQUEST_IVR, str, ivrStateListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void requestNewSmsCode(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            FileLog.e("VerificationApi", "sessionId must be not null");
        } else {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REQUEST_NEW_SMS_CODE, str));
        }
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void requestVerificationState(@NonNull String str, @NonNull VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATE, str, verificationStateChangedListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void requestVerificationStates(@NonNull VerificationApi.VerificationStatesHandler verificationStatesHandler) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATES, verificationStatesHandler));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void reset() {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_RESET, (Object) null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void resetVerificationCodeError(@NonNull String str) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_RESET_VERIFICATION_CODE_ERROR, str));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    @Deprecated
    public final void searchPhoneAccounts(@NonNull VerificationApi.PhoneAccountSearchListener phoneAccountSearchListener, boolean z) {
        if (z) {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SEARCH_PHONE_ACCOUNTS, phoneAccountSearchListener));
        }
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void sendCallInClickStats(@NonNull String str) throws IllegalStateException, IllegalArgumentException {
        this.q.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_SEND_STATS, str));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void setAllowedPermissions(@NonNull String[] strArr) {
        FileLog.v("VerificationApi", "allowed permissions %s", Arrays.toString(strArr));
        this.n.set(strArr);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void setApiEndpoint(@Nullable String str) {
        if (str != null) {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SET_PROXY_ENDPOINT, str));
            return;
        }
        String a2 = ru.mail.libverify.c.c.a();
        if (a2 != null) {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SET_PROXY_ENDPOINT, a2));
        }
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void setApiEndpoints(@NonNull Map<String, String> map) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SET_API_ENDPOINTS, map));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void setCustomLocale(@NonNull Locale locale) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SET_LOCALE, locale));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void setSimDataSendDisabled(boolean z) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SET_DISABLE_SIM_DATA_SEND, Boolean.valueOf(z)));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void signOut(boolean z) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SIGN_OUT, Boolean.valueOf(z), null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void softSignOut() {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SOFT_SIGN_OUT, (Object) null));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    @NonNull
    public final String startVerification(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable VerifyRoute verifyRoute, @Nullable VerificationParameters verificationParameters) throws IllegalStateException {
        return a(new ru.mail.libverify.e.f(str, verifyRoute == null ? ru.mail.libverify.e.g.a() : ru.mail.libverify.e.g.a(verifyRoute), str2, str3, map, null, verificationParameters));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    @NonNull
    public final String startVerificationWithVKConnect(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4, @Nullable VerificationParameters verificationParameters) throws IllegalStateException {
        return a(new ru.mail.libverify.e.f(str, ru.mail.libverify.e.g.d(), str2, str3, map, str4, verificationParameters));
    }

    @Override // ru.mail.libverify.api.j
    public final void throwUncaughtException(@Nullable String str) {
        if (str == null) {
            str = "Test Uncaught Exception";
        }
        throw new RuntimeException(str);
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void verifySmsCode(@NonNull String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            FileLog.e("VerificationApi", "sessionId and smsCode must be not null");
        } else {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_VERIFY_SMS_CODE, str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ru.mail.libverify.g.b bVar) {
        this.y.get().a(ru.mail.libverify.n0.e.f(bVar.e().l()), new ru.mail.libverify.i.k(this.a.getContext(), bVar, false));
    }

    private void d(@NonNull String str) {
        FileLog.v("VerificationApi", "received fetcher info %s", str);
        try {
            ru.mail.libverify.m.f fVar = (ru.mail.libverify.m.f) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.m.f.class);
            try {
                FileLog.v("VerificationApi", "received fetcher info %s", fVar);
                this.h.get().b(fVar);
            } catch (Exception e2) {
                ru.mail.libverify.n0.b.a("VerificationApi", "failed to process fetcher info", e2);
            }
        } catch (JsonParseException e3) {
            ru.mail.libverify.n0.b.a("VerificationApi", "failed to parse fetcher info json", e3);
        }
    }

    @NonNull
    private m e() {
        if (this.F == null) {
            this.F = new m(this.m);
        }
        return this.F;
    }

    private void f(@NonNull ru.mail.libverify.g.b bVar) {
        FileLog.v("VerificationApi", "process message %s", bVar);
        try {
            bVar.a(this.u.b());
            this.f.f(bVar);
            if (a(bVar)) {
                b.a e2 = bVar.e();
                int i = c.a[e2.o().ordinal()];
                if (i == 1) {
                    e(bVar);
                    return;
                }
                if (i == 2) {
                    c(bVar);
                    return;
                }
                if (i == 3) {
                    d(bVar);
                    return;
                }
                if (i != 4) {
                    throw new IllegalArgumentException("unexpected message type " + e2.o());
                }
                FileLog.v("VerificationApi", "verified message %s", bVar);
                s a2 = this.b.a(bVar.e().l(), o.b.ALL);
                if (a2 != null) {
                    a2.E();
                }
            }
        } catch (Exception e3) {
            ru.mail.libverify.n0.b.a("VerificationApi", e3, "failed to process server notification", new Object[0]);
        }
    }

    private void g() {
        if (this.a.c().getValue("api_no_gcm_service_sent") == null) {
            ru.mail.libverify.j0.b bVar = this.z.get();
            ru.mail.libverify.u.w wVar = this.a;
            ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REPORT_NO_GCM_SERVICE, wVar.C().c())));
            this.a.c().putValue("api_no_gcm_service_sent", Long.toString(this.u.b())).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        for (Map.Entry<ru.mail.libverify.e.f, Pair<String, Long>> entry : this.L.entrySet()) {
            if (this.u.b() - ((Long) entry.getValue().second).longValue() > 500) {
                this.L.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        ru.mail.libverify.a.a.b(this.I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        ru.mail.libverify.a.a.a(this.I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j;
        this.a.F();
        a.C2209a a2 = this.s.get().a().a(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name()).a("settings_action_type", j.a.TIMER.name());
        Long l = null;
        Long longValue = this.a.c().getLongValue("api_settings_timeout", null);
        if (longValue == null || longValue.longValue() <= 0) {
            FileLog.d("VerificationApi", "use default timeout for settings check");
            j = TimeUtils.MILLISECONDS_PER_DAY;
        } else {
            j = longValue.longValue();
            Long longValue2 = this.a.c().getLongValue("api_settings_timestamp", null);
            if (longValue2 != null) {
                long b2 = this.u.b() - longValue2.longValue();
                if (b2 >= 0) {
                    l = Long.valueOf(b2);
                }
            }
            if (l != null && l.longValue() > 0 && j > l.longValue()) {
                j -= l.longValue();
                if (j <= 43200000) {
                    j = 43200000;
                }
            }
            FileLog.d("VerificationApi", "timeout for the next settings check %d", Long.valueOf(j));
        }
        a2.a(j).b().c();
        this.s.get().a().a(ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN.name()).a("gcm_token_check_type", ru.mail.libverify.n0.c.PERIODIC.name()).a(172800000L).b().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ru.mail.libverify.api.e l() {
        return new ru.mail.libverify.api.e(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ru.mail.libverify.f.c m() {
        return new ru.mail.libverify.f.c(this.m, this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ru.mail.libverify.api.g n() {
        return new ru.mail.libverify.api.g(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.a.b();
    }

    private void p() {
        this.p.d().submit(new kv2(this, 22));
    }

    @NonNull
    private h q() {
        String c2 = this.v.get().c();
        String value = this.a.c().getValue("api_last_sent_push_token");
        FileLog.v("VerificationApi", "update push token %s -> %s", value, c2);
        if (TextUtils.isEmpty(c2)) {
            return h.UPDATING;
        }
        if (TextUtils.equals(value, c2)) {
            return h.ACTUAL;
        }
        ru.mail.libverify.j0.b bVar = this.z.get();
        ru.mail.libverify.u.w wVar = this.a;
        ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(wVar.C().c())));
        if (TextUtils.isEmpty(value)) {
            this.f.i();
        }
        return h.CHANGED;
    }

    @Override // ru.mail.libverify.g0.c
    public final void a() {
        ru.mail.libverify.j0.g.a(this.a.getContext(), this.a.getId());
        new Handler(this.a.getContext().getMainLooper()).post(new yn2(this, 13));
        MessageBus messageBus = this.q;
        ru.mail.libverify.p0.a aVar = ru.mail.libverify.p0.a.FEATURE_REPOSITORY_INIT;
        messageBus.register(Arrays.asList(ru.mail.libverify.p0.a.VERIFY_API_IPC_CONNECT_RESULT_RECEIVED, ru.mail.libverify.p0.a.API_INTERNAL_SILENT_EXCEPTION, ru.mail.libverify.p0.a.API_INTERNAL_UNHANDLED_EXCEPTION, ru.mail.libverify.p0.a.VERIFY_API_START_VERIFICATION, ru.mail.libverify.p0.a.VERIFY_API_COMPLETE_VERIFICATION, ru.mail.libverify.p0.a.VERIFY_API_RESET_VERIFICATION_CODE_ERROR, ru.mail.libverify.p0.a.VERIFY_API_CANCEL_VERIFICATION, ru.mail.libverify.p0.a.VERIFY_API_REQUEST_NEW_SMS_CODE, ru.mail.libverify.p0.a.VERIFY_API_CHECK_PHONE_NUMBER, ru.mail.libverify.p0.a.VERIFY_API_REQUEST_IVR, ru.mail.libverify.p0.a.VERIFY_API_VERIFY_SMS_CODE, ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATE, ru.mail.libverify.p0.a.VERIFY_API_REQUEST_VERIFICATION_STATES, ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION, ru.mail.libverify.p0.a.VERIFY_API_SET_LOCALE, ru.mail.libverify.p0.a.VERIFY_API_SET_API_ENDPOINTS, ru.mail.libverify.p0.a.VERIFY_API_SET_PROXY_ENDPOINT, ru.mail.libverify.p0.a.VERIFY_API_REMOVE_PROXY_ENDPOINT, ru.mail.libverify.p0.a.VERIFY_API_SEARCH_PHONE_ACCOUNTS, ru.mail.libverify.p0.a.VERIFY_API_CHECK_NETWORK, ru.mail.libverify.p0.a.VERIFY_API_RESET, ru.mail.libverify.p0.a.VERIFY_API_SIGN_OUT, ru.mail.libverify.p0.a.VERIFY_API_SOFT_SIGN_OUT, ru.mail.libverify.p0.a.VERIFY_API_PREPARE_2FA_CHECK, ru.mail.libverify.p0.a.VERIFY_API_CHECK_ACCOUNT_VERIFICATION_BY_SMS, ru.mail.libverify.p0.a.VERIFY_API_SET_DISABLE_SIM_DATA_SEND, ru.mail.libverify.p0.a.VERIFY_API_REQUEST_GCM_TOKEN, ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED, ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CONFIRM, ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CANCEL, ru.mail.libverify.p0.a.SERVICE_SMS_RECEIVED, ru.mail.libverify.p0.a.SERVICE_CALL_RECEIVED, ru.mail.libverify.p0.a.SERVICE_SMS_RETRIEVER_SMS_RECEIVED, ru.mail.libverify.p0.a.SERVICE_IPC_SMS_MESSAGE_RECEIVED, ru.mail.libverify.p0.a.SERVICE_IPC_CANCEL_NOTIFICATION_RECEIVED, ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STARTED_RECEIVED, ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STOPPED_RECEIVED, ru.mail.libverify.p0.a.SERVICE_FETCHER_START_WITH_CHECK, ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK, ru.mail.libverify.p0.a.SERVICE_SETTINGS_BATTERY_STATE_CHANGED, ru.mail.libverify.p0.a.SERVICE_SETTINGS_NOTIFICATION_UNBLOCK, ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_FAILED, ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_SUCCEEDED, ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_WAIT_TIMEOUT, ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_SHOWN, ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_REPORT_REUSE, ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_REPORT_SPAM, ru.mail.libverify.p0.a.UI_NOTIFICATION_SETTINGS_BLOCK, ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_SHORTCUT_CREATED, ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_OPENED, ru.mail.libverify.p0.a.UI_NOTIFICATION_GET_INFO, ru.mail.libverify.p0.a.UI_NOTIFICATION_OPENED, ru.mail.libverify.p0.a.SMS_STORAGE_ADDED, ru.mail.libverify.p0.a.SMS_STORAGE_CLEARED, ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REMOVED, ru.mail.libverify.p0.a.SMS_STORAGE_SMS_REMOVED, ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REQUESTED, ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOGS_REQUESTED, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_COMPLETED, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_REQUEST_SMS_INFO, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_STARTED, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_COMPLETED, ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED, ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STARTED, ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED, ru.mail.libverify.p0.a.FETCHER_MANAGER_MESSAGE_RECEIVED, ru.mail.libverify.p0.a.FETCHER_MANAGER_SERVER_INFO_RECEIVED, ru.mail.libverify.p0.a.PHONE_NUMBER_CHECKER_NEW_CHECK_STARTED, ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_ADDED, ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_REMOVED, ru.mail.libverify.p0.a.NOTIFICATION_BAR_MANAGER_ONGOING_NOTIFICATION_SHOWN, ru.mail.libverify.p0.a.SAFETY_NET_RESPONE_RECEIVED, ru.mail.libverify.p0.a.SERVER_ACTION_RESULT, ru.mail.libverify.p0.a.SERVER_ACTION_FAILURE, ru.mail.libverify.p0.a.SESSION_CONTAINER_ADDED_SESSION, ru.mail.libverify.p0.a.SESSION_CONTAINER_REMOVED_SESSION, ru.mail.libverify.p0.a.VERIFICATION_SESSION_STATE_CHANGED, ru.mail.libverify.p0.a.VERIFICATION_SESSION_FETCHER_INFO_RECEIVED, ru.mail.libverify.p0.a.VERIFICATION_SESSION_MOBILEID_RESULTS_RECEIVED, ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_EXECUTED, ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_SEND_STATS, ru.mail.libverify.p0.a.GCM_TOKEN_UPDATED, ru.mail.libverify.p0.a.GCM_SERVER_INFO_RECEIVED, ru.mail.libverify.p0.a.GCM_FETCHER_INFO_RECEIVED, ru.mail.libverify.p0.a.GCM_MESSAGE_RECEIVED, ru.mail.libverify.p0.a.GCM_TOKEN_UPDATE_FAILED, ru.mail.libverify.p0.a.GCM_TOKEN_REFRESHED, ru.mail.libverify.p0.a.GCM_NO_GOOGLE_PLAY_SERVICES_INSTALLED, ru.mail.libverify.p0.a.APP_MOVE_TO_BACKGROUND, ru.mail.libverify.p0.a.APP_MOVE_TO_FOREGROUND, aVar, ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT, ru.mail.libverify.p0.a.API_SHUTDOWN), this);
        this.p.post(ru.mail.libverify.p0.e.a(aVar, new Object[0]));
        this.p.d().submit(new fs2(this, 22));
        q();
        FileLog.v("VerificationApi", "session processing started (count = %d)", Integer.valueOf(this.b.f()));
        Iterator it = this.b.g().iterator();
        while (it.hasNext()) {
            ((s) it.next()).M();
        }
    }

    @Override // ru.mail.libverify.g0.c
    @NonNull
    public final LinkedList c() {
        return new ru.mail.libverify.g0.s().a(this.h).a(this.z).a(this.i).a(this.v).a(this.j).a();
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void cancelVerification(@NonNull String str, @NonNull VerificationApi.CancelReason cancelReason) {
        if (TextUtils.isEmpty(str)) {
            FileLog.e("VerificationApi", "session id must be not null");
        } else {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_CANCEL_VERIFICATION, str, cancelReason));
        }
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void searchPhoneAccounts(@NonNull VerificationApi.PhoneAccountSearchListener phoneAccountSearchListener) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SEARCH_PHONE_ACCOUNTS, phoneAccountSearchListener));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void signOut(boolean z, @Nullable SignOutCallback signOutCallback) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SIGN_OUT, Boolean.valueOf(z), signOutCallback));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    public final void softSignOut(@Nullable SignOutCallback signOutCallback) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_SOFT_SIGN_OUT, signOutCallback));
    }

    @Override // ru.mail.libverify.api.VerificationApi
    @NonNull
    public final String startVerification(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable VerificationParameters verificationParameters) throws IllegalStateException {
        return a(new ru.mail.libverify.e.f(str, ru.mail.libverify.e.g.a(), str2, str3, map, null, verificationParameters));
    }

    private void e(@NonNull ru.mail.libverify.g.b bVar) {
        b.a e2 = bVar.e();
        if (!TextUtils.isEmpty(e2.e()) && !TextUtils.isEmpty(e2.n())) {
            if (this.a.d("instance_write_history")) {
                this.o.a(e2.e(), e2.n(), bVar.d(), bVar.g());
            }
            boolean z = e2.d().contains(b.a.EnumC2202b.IPC) && !TextUtils.isEmpty(e2.l());
            boolean contains = e2.d().contains(b.a.EnumC2202b.SMS);
            boolean z2 = e2.d().contains(b.a.EnumC2202b.POPUP) && ru.mail.libverify.i.i.a(this.a.getContext(), this.a.getContext().getString(R.string.libverify_high_notification_id));
            if (!z && !z2 && !contains) {
                FileLog.e("VerificationApi", "all notifications blocked by flags");
                a(Arrays.asList(j.d.SMS_ACCESS_ERROR, j.d.IPC_ACCESS_ERROR), bVar, (String) null);
                return;
            }
            ru.mail.libverify.g.b a2 = this.g.a(bVar.c());
            if (bVar.equals(a2)) {
                this.f.a(a2, bVar);
                FileLog.d("VerificationApi", "message %s has been already registered", bVar);
                return;
            }
            this.g.a(bVar.c(), bVar);
            if (z) {
                a(bVar, false);
                a(bVar, contains, z2);
                return;
            } else if (z2) {
                a(bVar, false);
                a(Collections.singletonList(j.d.DELIVERED), bVar, (String) null);
                return;
            } else {
                FileLog.d("VerificationApi", "failed to write sms");
                a(Collections.singletonList(j.d.SMS_ACCESS_ERROR), bVar, (String) null);
                return;
            }
        }
        FileLog.e("VerificationApi", "ether text or from field is undefined");
    }

    @Override // ru.mail.libverify.api.j
    @NonNull
    public final ArrayList b() {
        return this.b.a(o.b.ALL);
    }

    private void d(@NonNull ru.mail.libverify.g.b bVar) {
        FileLog.v("VerificationApi", "ping message %s", bVar);
        this.G.a(bVar.e().j());
        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.j(this.a, Collections.singletonList(j.d.DELIVERED), bVar.e().l(), bVar.a(), j.b.SERVER_INFO, null, null, bVar.e().a(), bVar.d()));
    }

    private void b(@NonNull s sVar) {
        if (!this.b.a(sVar.h())) {
            this.b.a(sVar.h(), sVar);
            p();
            q();
            a(new li0(11, this, sVar));
            return;
        }
        a(sVar.h(), new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FINAL, this.a.y().a(), false));
        throw new IllegalStateException("Two verification sessions have same ids.");
    }

    private void c(@NonNull String str) {
        FileLog.v("VerificationApi", "gcm message received");
        try {
            ru.mail.libverify.g.b bVar = (ru.mail.libverify.g.b) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.g.b.class);
            bVar.a(j.c.GCM);
            f(bVar);
        } catch (JsonParseException e2) {
            ru.mail.libverify.n0.b.a("VerificationApi", "failed to process server notification with unexpected json", e2);
        }
    }

    private void g(boolean z) {
        boolean I = this.a.I();
        this.a.setSimDataSendDisabled(z);
        if (I == z || z) {
            return;
        }
        FileLog.d("VerificationApi", "force update sim card data to server");
        ru.mail.libverify.j0.b bVar = this.z.get();
        ru.mail.libverify.u.w wVar = this.a;
        ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(wVar.C().c())));
    }

    private void a(@NonNull ru.mail.libverify.m.o oVar) {
        FileLog.v("VerificationApi", "delayed verify status message %s", oVar);
        s a2 = oVar.o() != null ? this.b.a(oVar.o(), o.b.ALL_HASHED) : null;
        if (a2 == null && !TextUtils.isEmpty(oVar.t()) && (a2 = this.b.a(oVar.t(), o.b.ALL)) != null) {
            FileLog.e("VerificationApi", "Delayed response should contain hashed session id due to security reasons (not only session_id)! Response: %s", oVar);
        }
        if (a2 != null) {
            a2.a(oVar);
        }
    }

    private void c(@NonNull ru.mail.libverify.g.b bVar) {
        ru.mail.libverify.l.b bVar2;
        FileLog.v("VerificationApi", "ping message %s", bVar);
        int i = c.c[bVar.a().ordinal()];
        if (i == 1) {
            ru.mail.libverify.j0.b bVar3 = this.z.get();
            ru.mail.libverify.u.w wVar = this.a;
            int i2 = c.h[VerificationFactory.getPlatformService(wVar.getContext()).getServiceType().ordinal()];
            if (i2 != 1) {
                bVar2 = i2 != 2 ? null : ru.mail.libverify.l.b.PING_RESPONSE_GCM;
            } else {
                bVar2 = ru.mail.libverify.l.b.PING_RESPONSE_HMS;
            }
            if (bVar2 == null) {
                bVar2 = ru.mail.libverify.l.b.PING_RESPONSE_GCM;
            }
            ru.mail.libverify.j0.n.a(bVar3, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(bVar2, wVar.C().c())));
            return;
        }
        if (i == 2) {
            ru.mail.libverify.j0.b bVar4 = this.z.get();
            ru.mail.libverify.u.w wVar2 = this.a;
            ru.mail.libverify.j0.n.a(bVar4, new ru.mail.libverify.requests.l(wVar2, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.PING_RESPONSE_FETCHER, wVar2.C().c())));
        } else {
            if (i == 3) {
                ru.mail.libverify.j0.b bVar5 = this.z.get();
                ru.mail.libverify.u.w wVar3 = this.a;
                ru.mail.libverify.j0.n.a(bVar5, new ru.mail.libverify.requests.l(wVar3, ru.mail.libverify.l.c.a(wVar3.C().c())));
                return;
            }
            throw new IllegalArgumentException("Illegal message delivery method");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, VerificationApi.CancelReason cancelReason) {
        FileLog.v("VerificationApi", "cancel verification for session %s by reason %s", str, cancelReason);
        s c2 = this.b.c(str);
        this.H.a(str);
        if (c2 != null) {
            this.f.a(c2, cancelReason);
            c2.a();
        }
    }

    private void f(@NonNull String str) {
        FileLog.v("VerificationApi", "request new sms code for session %s", str);
        s a2 = this.b.a(str, o.b.NOT_TEMPORARY);
        if (a2 != null) {
            a2.I();
            this.f.h(a2);
        } else {
            a(str, new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FINAL, this.a.y().a(), false));
        }
    }

    private void d(final boolean z) {
        if (this.a.d("instance_single_fetcher")) {
            FileLog.v("VerificationApi", "fetcher started result %s", Boolean.valueOf(z));
            ru.mail.libverify.h.f fVar = new ru.mail.libverify.h.f(this.a.getContext(), this, new f.b() { // from class: xsna.o9z0
                @Override // ru.mail.libverify.h.f.b
                public final void a(f.c cVar) {
                    ru.mail.libverify.api.q.a(z, cVar);
                }
            });
            if (z) {
                fVar.a();
                return;
            } else {
                fVar.b();
                return;
            }
        }
        FileLog.d("VerificationApi", "fetcher communication disabled");
    }

    private boolean a(@NonNull ru.mail.libverify.g.b bVar) {
        b.a e2 = bVar.e();
        ArrayList arrayList = new ArrayList();
        String g2 = e2.g();
        String str = null;
        if (TextUtils.isEmpty(g2)) {
            g2 = null;
        }
        String f2 = e2.f();
        if (TextUtils.isEmpty(f2)) {
            f2 = null;
        }
        boolean z = this.a.I() && g2 == null;
        if (!z && !TextUtils.equals(this.a.b().c(), g2)) {
            FileLog.e("VerificationApi", "%s provided imsis are not equal to local imsi", this.a.toString());
            arrayList.add(j.d.IMSI_NOT_MATCH);
        }
        boolean z2 = this.a.I() && f2 == null;
        if (!z2 && !TextUtils.equals(this.a.b().b(), f2)) {
            FileLog.e("VerificationApi", "%s provided imeis are not equal to local imeis", this.a.toString());
            arrayList.add(j.d.IMEI_NOT_MATCH);
        }
        FileLog.v("VerificationApi", "Imsi ignored: %s. Imei ignored: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!TextUtils.equals(ru.mail.libverify.n0.e.f(this.a.getId()), e2.a())) {
            FileLog.e("VerificationApi", "%s provided id is not equal to local id", this.a.toString());
            arrayList.add(j.d.APPLICATION_ID_NOT_MATCH);
            str = e2.a();
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        a(arrayList, bVar, str);
        return false;
    }

    private void b(@NonNull String str, @NonNull String str2) {
        FileLog.v("VerificationApi", "sms code %s code verification for session %s", str2, str);
        s a2 = this.b.a(str, o.b.NOT_TEMPORARY);
        if (a2 != null) {
            a2.h(str2);
        } else {
            a(str, new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FINAL, this.a.y().a(), false));
        }
    }

    private void f(boolean z) {
        FileLog.d("VerificationApi", "instance reset started (drop installation = %s)", Boolean.valueOf(z));
        if (z) {
            this.a.L();
            this.a.c().removeValue("api_last_sent_push_token").removeValue("settings_notify_permissions_key").removeValue("api_settings_timestamp");
            this.p.reset();
        }
        this.b.a();
        this.g.a();
        this.y.get().a();
        this.a.c().commitSync();
        this.G.a();
        this.a.C().c();
        FileLog.d("VerificationApi", "instance reset completed");
    }

    private void d() {
        this.t.a("last_session", this.p.b(), 500L, new wd2(this, 13));
    }

    private void b(@NonNull VerificationApi.PhoneAccountSearchListener phoneAccountSearchListener) {
        FileLog.d("VerificationApi", "search accounts requested");
        a(new vrl(8, this, phoneAccountSearchListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        this.c.remove(verificationStateChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        this.d.remove(smsCodeNotificationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z) {
        SignOutCallback andSet = this.J.getAndSet(null);
        if (andSet != null) {
            andSet.onCompleted(z);
        }
    }

    private void b(@NonNull String str) {
        ru.mail.libverify.g.b b2 = this.g.b(str);
        if (b2 == null) {
            FileLog.e("VerificationApi", "notification with id %s doesn't exist", str);
            return;
        }
        if (!b2.e().r()) {
            FileLog.e("VerificationApi", "notification with id %s is not allowed to be confirmed", str);
            return;
        }
        b.a e2 = b2.e();
        this.y.get().a(b2.c());
        FileLog.v("VerificationApi", "notification %s confirmed", b2);
        try {
            ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.a(this.a, e2.p(), e2.q(), this.a.getId()));
            this.f.a(b2);
        } catch (Exception e3) {
            ru.mail.libverify.n0.b.a("VerificationApi", e3, "Failed to prepare AttemptApiRequest for %s", b2);
        }
    }

    private void c(boolean z) {
        FileLog.v("VerificationApi", "onNetworkStateChangedInternal %s", Boolean.valueOf(z));
        if (z) {
            ru.mail.libverify.requests.c.z();
            this.h.get().p();
            q();
            FileLog.v("VerificationApi", "sessions notified (count = %d) network available", Integer.valueOf(this.b.f()));
            Iterator it = this.b.g().iterator();
            while (it.hasNext()) {
                ((s) it.next()).D();
            }
            return;
        }
        if (this.b.b()) {
            FileLog.d("VerificationApi", "no network, start connection check");
            this.a.x();
        }
    }

    private void e(@NonNull String str) {
        FileLog.v("VerificationApi", "received server info %s from GCM", str);
        try {
            ru.mail.libverify.g.a aVar = (ru.mail.libverify.g.a) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.g.a.class);
            if (str.contains("ping_v2")) {
                aVar.h().getClass();
            }
            a(aVar, j.c.GCM);
        } catch (JsonParseException e2) {
            ru.mail.libverify.n0.b.a("VerificationApi", "failed to parse server info json", e2);
        }
    }

    @NonNull
    public static String[] f() {
        return new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_CALL_LOG", "android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    private void a(@NonNull final ru.mail.libverify.g.b bVar, final boolean z, final boolean z2) {
        b.a e2 = bVar.e();
        FileLog.v("VerificationApi", "post ipc message to session %s", e2.l());
        ru.mail.libverify.h.f fVar = new ru.mail.libverify.h.f(this.a.getContext(), this, new f.b() { // from class: xsna.t9z0
            @Override // ru.mail.libverify.h.f.b
            public final void a(f.c cVar) {
                ru.mail.libverify.api.q.this.a(bVar, z, z2, cVar);
            }
        });
        this.a.a(this, true, 0);
        fVar.a(e2.l(), e2.n(), e2.k());
    }

    private void e(boolean z) {
        FileLog.d("VerificationApi", "request sms info");
        if (!z && !this.a.d("instance_intercept_sms") && !this.a.d("instance_account_check_sms")) {
            FileLog.d("VerificationApi", "request sms info disabled by settings");
            return;
        }
        ru.mail.libverify.m.m z2 = this.a.z();
        if (z2 != null) {
            FileLog.d("VerificationApi", "sms info has been already downloaded");
            this.i.get().a(z2);
        } else {
            ru.mail.libverify.j0.b bVar = this.z.get();
            ru.mail.libverify.u.w wVar = this.a;
            ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REQUEST_SMS_INFO, wVar.C().c())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ru.mail.libverify.g.b bVar, boolean z, boolean z2, f.c cVar) {
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_IPC_CONNECT_RESULT_RECEIVED, bVar, Boolean.valueOf(z), Boolean.valueOf(z2), cVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(@NonNull ru.mail.libverify.g.b bVar, boolean z, @NonNull f.c cVar) {
        boolean a2;
        FileLog.v("VerificationApi", "processIpcConnectResult state %s", cVar);
        HashSet hashSet = new HashSet();
        switch (c.b[cVar.ordinal()]) {
            case 1:
                if (!z) {
                    hashSet.add(j.d.UNABLE_TO_SHOW);
                }
                hashSet.add(j.d.DELIVERED);
                a2 = false;
                a(new ArrayList(hashSet), bVar, (String) null);
                if (!a2) {
                    this.g.b(bVar.c());
                }
                this.a.a(this);
                return;
            case 2:
                if (z) {
                    a2 = a(bVar, true);
                    a(new ArrayList(hashSet), bVar, (String) null);
                    if (!a2) {
                    }
                    this.a.a(this);
                    return;
                }
                a2 = false;
                a(new ArrayList(hashSet), bVar, (String) null);
                if (!a2) {
                }
                this.a.a(this);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                hashSet.add(j.d.IPC_ACCESS_ERROR);
                if (z) {
                    a2 = a(bVar, true);
                    hashSet.add(j.d.DELIVERED);
                    a(new ArrayList(hashSet), bVar, (String) null);
                    if (!a2) {
                    }
                    this.a.a(this);
                    return;
                }
                hashSet.add(j.d.UNABLE_TO_SHOW);
                a2 = false;
                a(new ArrayList(hashSet), bVar, (String) null);
                if (!a2) {
                }
                this.a.a(this);
                return;
            default:
                throw new IllegalStateException("State should be defined before calling onConnectResult() callback");
        }
    }

    private boolean a(@NonNull ru.mail.libverify.g.b bVar, boolean z) {
        ArrayList arrayList;
        if (z && this.g.a(bVar.c()) == null) {
            FileLog.e("VerificationApi", "notification with id %s doesn't exist", bVar.c());
            return false;
        }
        FileLog.v("VerificationApi", "show popup %s", bVar);
        this.p.d().execute(new xsna.b0(7, this, bVar));
        new ru.mail.libverify.h.f(this.a.getContext(), this, new b630(bVar, 28)).a(bVar.c(), bVar.d());
        synchronized (this) {
            arrayList = new ArrayList(this.d);
        }
        FileLog.v("VerificationApi", "notify sms listeners count %d", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VerificationApi.SmsCodeNotificationListener) it.next()).onNotification(bVar.e().n());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ru.mail.libverify.g.b bVar, f.c cVar) {
        FileLog.v("VerificationApi", "post cancel notification result %s for %s ", cVar, bVar);
    }

    private void a(@NonNull String str, @NonNull String str2) {
        Iterator it = this.b.g().iterator();
        while (it.hasNext()) {
            ((s) it.next()).b(str2, false);
        }
        Collection<ru.mail.libverify.g.b> e2 = this.g.e();
        if (e2 != null) {
            Iterator<ru.mail.libverify.g.b> it2 = e2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ru.mail.libverify.g.b next = it2.next();
                if (next.e().q() != null && str2.contains(next.e().q())) {
                    this.f.c(next);
                    break;
                }
            }
        }
        if (this.b.c() && this.g.b() && this.a.d("instance_intercept_sms") && this.a.a(str)) {
            this.i.get().a(new ru.mail.libverify.n.k(this.u.b(), str, str2));
        }
    }

    private void a(@NonNull String str, long j) {
        Collection<ru.mail.libverify.g.b> e2 = this.g.e();
        if (e2 != null) {
            ArrayList arrayList = new ArrayList(e2);
            FileLog.v("VerificationApi", "current messages count %d", Integer.valueOf(arrayList.size()));
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ru.mail.libverify.g.b bVar = (ru.mail.libverify.g.b) it.next();
                if (TextUtils.equals(str, bVar.c()) && bVar.d() < j) {
                    this.g.b(bVar.c());
                    FileLog.v("VerificationApi", "removed message timestamp %d", Long.valueOf(bVar.d()));
                    z = true;
                }
            }
            if (z) {
                this.y.get().a(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, f.c cVar) {
        FileLog.v("VerificationApi", "post fetcher started result %s with started %s", cVar, Boolean.valueOf(z));
    }

    private void a(@NonNull h hVar) {
        String c2;
        FileLog.d("VerificationApi", "push token update result: %s", hVar);
        if (hVar == h.UPDATING) {
            return;
        }
        int i = c.d[hVar.ordinal()];
        if (i == 1) {
            c2 = this.v.get().c();
            if (c2 != null) {
                this.a.a(Collections.singletonMap(VerificationFactory.LIBVERIFY_GCM_TOKEN, c2));
            }
        } else if (i == 2) {
            c2 = this.v.get().c();
        } else {
            throw new IllegalArgumentException();
        }
        if (this.e.isEmpty()) {
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((VerificationApi.GcmTokenListener) it.next()).onReceived(c2);
        }
        this.e.clear();
    }

    private void a(@NonNull List<j.d> list, @NonNull ru.mail.libverify.g.b bVar, String str) {
        if (list.isEmpty()) {
            return;
        }
        this.f.a(bVar, list);
        ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.j(this.a, list, bVar.e().l(), bVar.a(), j.b.SMS_CODE, null, null, str, bVar.d()));
    }

    @NonNull
    private String a(@NonNull ru.mail.libverify.e.f fVar) {
        ru.mail.libverify.l.d dVar;
        if (fVar.g().g() != VerifyRoute.VKCLogin && TextUtils.isEmpty(fVar.d()) && TextUtils.isEmpty(fVar.c())) {
            throw new IllegalArgumentException("Either user id or phone must be non null");
        }
        Pair<String, Long> pair = this.L.get(fVar);
        if (pair != null) {
            long longValue = ((Long) pair.second).longValue();
            String str = (String) pair.first;
            if (this.u.b() - longValue <= 500) {
                this.L.put(fVar, new Pair<>(str, Long.valueOf(this.u.b())));
                d();
                return str;
            }
        }
        VerificationParameters e2 = fVar.e();
        if (e2 == null) {
            dVar = null;
        } else {
            ru.mail.libverify.l.d.Companion.getClass();
            dVar = new ru.mail.libverify.l.d(e2.getCallUIEnabled(), e2.getCallInEnabled(), e2.getExternalId(), e2.getStateChangeOnErrorEnabled(), e2.getCallEnabled(), e2.getMobileIdEnabled(), e2.getPushEnabled(), e2.getSmsEnabled(), e2.getMessengerEnabled());
        }
        if (this.C == null) {
            this.C = new ru.mail.libverify.n.m(this.m);
        }
        ru.mail.libverify.n.m mVar = this.C;
        if (this.D == null) {
            this.D = new ru.mail.libverify.n.h(this.m, this.f);
        }
        ru.mail.libverify.n.h hVar = this.D;
        if (this.E == null) {
            this.E = new ru.mail.libverify.b0.a(this.m);
        }
        s sVar = new s(mVar, hVar, this.E, this.m, fVar.f(), fVar.g(), fVar.d(), fVar.c(), this.u, fVar.a(), fVar.b(), dVar, this.t, this.f);
        ru.mail.libverify.j0.g.a(this.a.getContext(), sVar.h());
        this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_START_VERIFICATION, sVar));
        this.L.put(fVar, new Pair<>(sVar.h(), Long.valueOf(this.u.b())));
        d();
        return sVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s sVar) {
        sVar.M();
        this.f.j(sVar);
    }

    private void a(@NonNull final String str, @NonNull final VerificationApi.CancelReason cancelReason) {
        Runnable runnable = new Runnable() { // from class: xsna.u9z0
            @Override // java.lang.Runnable
            public final void run() {
                ru.mail.libverify.api.q.this.b(str, cancelReason);
            }
        };
        if (this.a.d("instance_background_verify") && (ru.mail.libverify.n0.e.b(this.a.getContext(), "android.permission.READ_PHONE_STATE") || ru.mail.libverify.n0.e.b(this.a.getContext(), "android.permission.RECEIVE_SMS"))) {
            s a2 = this.b.a(str, o.b.ALL);
            if (a2 != null) {
                if (a2.m().completedSuccessfully()) {
                    runnable.run();
                    return;
                }
                this.b.b(str);
                FileLog.v("VerificationApi", "cancel verification for session %s has been delayed for %d", str, 600000);
                this.f.k(a2);
                this.p.b().postDelayed(runnable, 600000L);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VerificationApi.PhoneAccountSearchListener phoneAccountSearchListener) {
        ArrayList arrayList = new ArrayList();
        ru.mail.libverify.b.a a2 = this.B.a(this.a.b());
        if (a2 != null) {
            arrayList.add(new VerificationApi.PhoneAccountSearchItem(a2.a(), ""));
        }
        phoneAccountSearchListener.onComplete(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        this.c.add(verificationStateChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        this.d.add(smsCodeNotificationListener);
    }

    private void a(@NonNull String str, @NonNull VerificationApi.VerificationStateChangedListener verificationStateChangedListener) {
        s a2 = this.b.a(str, o.b.NOT_TEMPORARY);
        if (a2 != null) {
            VerificationApi.VerificationStateDescriptor m = a2.m();
            FileLog.v("VerificationApi", "session %s state is %s", str, m);
            verificationStateChangedListener.onStateChanged(str, m);
            return;
        }
        verificationStateChangedListener.onStateChanged(str, null);
    }

    private void a(boolean z, @Nullable SignOutCallback signOutCallback) {
        ru.mail.libverify.requests.l lVar;
        ru.mail.libverify.u.w w = this.a.w();
        f(false);
        if (z) {
            lVar = new ru.mail.libverify.requests.l(w, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REPORT_SIGNOUT, ru.mail.libverify.l.a.PHONE, ((ru.mail.libverify.storage.g) w).C().c()));
        } else {
            lVar = new ru.mail.libverify.requests.l(w, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REPORT_SIGNOUT, ru.mail.libverify.l.a.DEVICE, ((ru.mail.libverify.storage.g) w).C().c()));
        }
        this.J.set(signOutCallback);
        ru.mail.libverify.j0.n.a(this.z.get(), lVar);
        this.f.e();
    }

    private void a(boolean z) {
        new Handler(this.a.getContext().getMainLooper()).post(new jtd(this, z, 3));
    }

    private void a(@Nullable SignOutCallback signOutCallback) {
        f(false);
        ru.mail.libverify.u.w w = this.a.w();
        ru.mail.libverify.requests.l lVar = new ru.mail.libverify.requests.l(w, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.REPORT_SOFT_SIGNOUT, ((ru.mail.libverify.storage.g) w).C().c()));
        this.J.set(signOutCallback);
        ru.mail.libverify.j0.n.a(this.z.get(), lVar);
        this.f.f();
        this.s.get().a().a(ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN.name()).a("gcm_token_check_type", ru.mail.libverify.n0.c.ONCE.name()).a(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS).a().c();
    }

    private void a(@Nullable String str, @Nullable VerificationApi.AccountCheckListener accountCheckListener) {
        if (TextUtils.isEmpty(str)) {
            FileLog.e("VerificationApi", "empty account data json");
            return;
        }
        this.f.a();
        if (this.a.d("instance_account_check_sms")) {
            this.i.get().a(str, accountCheckListener);
            return;
        }
        ru.mail.libverify.j0.b bVar = this.z.get();
        ru.mail.libverify.u.w wVar = this.a;
        ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.b(str, wVar.C().c())));
    }

    private void a(@NonNull String str, @NonNull VerificationApi.IvrStateListener ivrStateListener) {
        FileLog.d("VerificationApi", "ivr requested for session %s", str);
        s a2 = this.b.a(str, o.b.NOT_TEMPORARY);
        if (a2 != null) {
            this.f.g(a2);
            a2.b(ivrStateListener);
        }
    }

    private void a(@NonNull String str) {
        ru.mail.libverify.g.b b2 = this.g.b(str);
        if (b2 == null) {
            FileLog.e("VerificationApi", "notification with id %s doesn't exist", str);
            return;
        }
        FileLog.v("VerificationApi", "notification %s removed from waiting list", b2);
        this.y.get().a(b2.c());
        this.f.b(b2);
    }

    private void a(@Nullable Runnable runnable) {
        String[] andSet = this.n.getAndSet(null);
        if (andSet == null || andSet.length == 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet(Arrays.asList(f()));
        ArrayList arrayList = new ArrayList(andSet.length);
        for (String str : andSet) {
            if (hashSet.contains(str) && !this.k.contains(str)) {
                arrayList.add(str);
                this.k.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        ru.mail.libverify.utils.permissions.a.a(this.a.getContext(), strArr, new b(strArr, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #0 {Exception -> 0x0033, blocks: (B:3:0x0006, B:5:0x0022, B:9:0x0036, B:12:0x003e, B:14:0x0048, B:16:0x0054, B:18:0x005a, B:20:0x006b, B:22:0x007b, B:23:0x0080, B:26:0x00a4, B:28:0x00aa, B:30:0x00b3, B:32:0x00c3, B:35:0x00dc, B:37:0x00e0, B:39:0x00f3, B:42:0x00fb, B:44:0x007e, B:46:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:3:0x0006, B:5:0x0022, B:9:0x0036, B:12:0x003e, B:14:0x0048, B:16:0x0054, B:18:0x005a, B:20:0x006b, B:22:0x007b, B:23:0x0080, B:26:0x00a4, B:28:0x00aa, B:30:0x00b3, B:32:0x00c3, B:35:0x00dc, B:37:0x00e0, B:39:0x00f3, B:42:0x00fb, B:44:0x007e, B:46:0x0065), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(@NonNull ru.mail.libverify.g.a aVar, @NonNull j.c cVar) {
        j.c cVar2;
        boolean z;
        String str;
        try {
            FileLog.v("VerificationApi", "received server info %s from %s", aVar, cVar);
            s a2 = this.b.a(aVar.g(), o.b.ALL_HASHED);
            Long p = aVar.p();
            boolean z2 = false;
            if (p != null && this.u.a() >= p.longValue()) {
                z2 = true;
            }
            boolean z3 = z2;
            if (aVar.q() && a2 != null) {
                String h2 = a2.h();
                if (!TextUtils.isEmpty(h2)) {
                    j.b a3 = a(aVar);
                    VerifyApiRequest.VerifyChecks m = aVar.m();
                    if (m == VerifyApiRequest.VerifyChecks.MESSENGER && aVar.i() != null) {
                        str = aVar.i().c();
                    } else {
                        str = m != null ? m.value : null;
                    }
                    z = z3;
                    cVar2 = cVar;
                    ru.mail.libverify.j0.n.a(this.z.get(), new ru.mail.libverify.requests.j(this.a, Collections.singletonList(z3 ? j.d.TTL_EXPIRED : j.d.DELIVERED), h2, cVar2, a3, str, aVar.l(), null, this.u.b()));
                    if (z) {
                        if (aVar.e() != null) {
                            a(aVar.e());
                        }
                        if (a2 == null) {
                            FileLog.e("VerificationApi", "Not found session %s", aVar.g());
                            if (aVar.k() != null) {
                                a(aVar.k());
                                return;
                            }
                            return;
                        }
                        if (this.H.a(a2.h(), aVar, cVar2).booleanValue()) {
                            FileLog.v("VerificationApi", "sessionId: serverInfo " + aVar.g() + " rejected as double");
                            return;
                        }
                        a(a2, aVar, cVar2);
                        return;
                    }
                    FileLog.v("VerificationApi", "sessionId: serverInfo " + aVar.g() + " rejected as TTL_EXPIRED");
                    return;
                }
            }
            cVar2 = cVar;
            z = z3;
            if (z) {
            }
        } catch (Exception e2) {
            ru.mail.libverify.n0.b.a("VerificationApi", "failed to process server info", e2);
        }
    }

    @NonNull
    private static j.b a(@NonNull ru.mail.libverify.g.a aVar) {
        if (aVar.o() == a.g.MOBILEID) {
            return j.b.MOBILEID;
        }
        if (aVar.o() == a.g.DO_ATTEMPT) {
            return j.b.DO_ATTEMPT;
        }
        if (aVar.c() == null && aVar.a() == null && aVar.n() == null && aVar.i() == null) {
            return j.b.SERVER_INFO;
        }
        return j.b.ROUTE_INFO;
    }

    private void a(@NonNull s sVar, @NonNull ru.mail.libverify.g.a aVar, @NonNull j.c cVar) {
        ru.mail.libverify.e.d fVar;
        a.d i;
        if (aVar.b() != null) {
            sVar.a(aVar.b());
            this.f.a(sVar, cVar);
        }
        CodeDeliveryInfo d2 = aVar.d();
        if (d2 != null) {
            sVar.a(d2);
        }
        if (aVar.o() == a.g.MOBILEID && aVar.j() != null) {
            if (aVar.j().b() == 0) {
                aVar.j().a(3);
            }
            sVar.a(aVar.j(), Boolean.FALSE);
            if (ru.mail.libverify.d0.a.a().e().a()) {
                FileLog.v("MobileId: for sessionId %s received url: %s", sVar.h(), aVar.j().c());
            }
        }
        if (aVar.o() == a.g.DO_ATTEMPT && aVar.f() != null) {
            sVar.a(aVar.f());
            this.f.b(sVar, cVar);
            if (ru.mail.libverify.d0.a.a().e().a()) {
                FileLog.v("MobileId: for sessionId %s received code: %s", sVar.h(), aVar.f().a());
            }
        }
        if (aVar.k() != null) {
            a.f k = aVar.k();
            Collection<ru.mail.libverify.g.b> e2 = this.g.e();
            if (e2 != null) {
                ArrayList arrayList = new ArrayList(e2);
                if (c.f[k.a().ordinal()] == 1) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ru.mail.libverify.g.b bVar = (ru.mail.libverify.g.b) it.next();
                        if (bVar.e() != null && TextUtils.equals(bVar.e().l(), sVar.h())) {
                            this.g.b(bVar.c());
                            this.y.get().a(bVar.c());
                            this.f.g(bVar);
                            FileLog.v("VerificationApi", "removed message %s", bVar.c());
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Action = " + k.a());
                }
            }
        }
        if (aVar.m() != null) {
            ru.mail.libverify.e.d.Companion.getClass();
            VerifyApiRequest.VerifyChecks m = aVar.m();
            int i2 = m == null ? -1 : d.c.a.a[m.ordinal()];
            if (i2 == 1) {
                a.h n = aVar.n();
                if (n != null) {
                    d.f.Companion.getClass();
                    fVar = new d.f(n.a());
                }
                fVar = null;
            } else if (i2 == 2) {
                a.b c2 = aVar.c();
                if (c2 != null) {
                    d.b.Companion.getClass();
                    Integer c3 = c2.c();
                    fVar = new d.b((c3 != null ? c3 : 0).intValue(), c2.d(), c2.a(), c2.b());
                }
                fVar = null;
            } else if (i2 != 3) {
                if (i2 == 4 && (i = aVar.i()) != null) {
                    d.C2194d.Companion.getClass();
                    fVar = new d.C2194d(i.b(), i.d(), i.c(), i.a());
                }
                fVar = null;
            } else {
                a.C2197a a2 = aVar.a();
                if (a2 != null) {
                    d.a.Companion.getClass();
                    int intValue = a2.a().intValue();
                    Integer c4 = a2.c();
                    fVar = new d.a(intValue, (c4 != null ? c4 : 0).intValue(), a2.b(), a2.d(), a2.e());
                }
                fVar = null;
            }
            if (fVar != null) {
                sVar.a(fVar);
            }
        }
    }

    private void a(@NonNull a.f fVar) throws IllegalArgumentException {
        if (fVar.a() == a.f.EnumC2198a.COMPLETED) {
            String b2 = fVar.b();
            if (TextUtils.isEmpty(b2)) {
                FileLog.v("VerificationApi", "remove all push notifications");
                this.y.get().a();
            } else {
                FileLog.v("VerificationApi", "remove all push notifications by sessionId: %s", b2);
                this.y.get().b(b2);
            }
        }
    }

    private void a(@NonNull ru.mail.libverify.requests.c<?, ?> cVar, @NonNull Throwable th) {
        try {
            if (cVar instanceof ru.mail.libverify.requests.l) {
                ru.mail.libverify.requests.l lVar = (ru.mail.libverify.requests.l) cVar;
                if (lVar.B() != ru.mail.libverify.l.b.REPORT_SIGNOUT) {
                    if (lVar.B() == ru.mail.libverify.l.b.REPORT_SOFT_SIGNOUT) {
                    }
                }
                a(false);
            }
            FileLog.d("VerificationApi", "handle server failure", th);
            if (th instanceof ServerException) {
                this.f.a(cVar, (ServerException) th);
                return;
            }
            if (th instanceof IOException) {
                if (this.a.D().b() && cVar.A()) {
                    FileLog.d("VerificationApi", "switched to the next api url");
                    this.f.a(cVar, (IOException) th);
                    return;
                }
                return;
            }
            if (th instanceof ClientException) {
                this.f.a(cVar, (ClientException) th);
            } else {
                this.f.a(th);
            }
        } catch (Throwable th2) {
            FileLog.e("VerificationApi", "failed to process server failure", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(@NonNull ru.mail.libverify.m.c<?, ?> cVar) {
        s a2;
        ru.mail.libverify.i.j C;
        try {
            if (cVar.g() == Status.OK) {
                if (cVar instanceof ru.mail.libverify.m.n) {
                    ru.mail.libverify.m.n nVar = (ru.mail.libverify.m.n) cVar;
                    ru.mail.libverify.requests.l lVar = (ru.mail.libverify.requests.l) nVar.a();
                    this.A.a();
                    long p = nVar.p();
                    String D = lVar != null ? lVar.D() : null;
                    if (!TextUtils.isEmpty(D)) {
                        this.a.c().putValue("api_last_sent_push_token", D);
                    }
                    if (lVar != null && (C = lVar.C()) != null) {
                        this.a.c().putValue("settings_notify_permissions_key", ru.mail.libverify.q0.a.f(C));
                    }
                    this.a.c().putValue("api_settings_timestamp", this.u.b());
                    if (p > 0) {
                        this.s.get().a().a(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name()).a("settings_action_type", j.a.TIMER.name()).a(p).b().c();
                        this.a.c().putValue("api_settings_timeout", p);
                    }
                    this.a.a("instance_broadcast_on_demand", nVar.k());
                    this.a.a("instance_intercept_sms", nVar.q());
                    this.a.a("instance_single_fetcher", nVar.t());
                    this.a.a("instance_account_check_sms", nVar.h());
                    this.a.a("instance_track_package", nVar.u());
                    this.a.a("instance_send_call_stats", nVar.r());
                    this.a.a("instance_update_alarms", nVar.v());
                    this.a.a("instance_background_verify", nVar.j());
                    this.a.a("instance_write_history", nVar.w());
                    this.a.a("instance_add_shortcut", nVar.i());
                    this.a.c().commit();
                    if (nVar.n()) {
                        this.i.get().a(nVar.o());
                        if (this.a.d("instance_intercept_sms")) {
                            this.a.a(nVar.o());
                        }
                    }
                    if (this.a.d("instance_intercept_sms")) {
                        if (!this.a.f()) {
                            this.s.get().a().a(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name()).a("settings_action_type", j.a.SMS_TEMPLATES_CHECK.name()).a(300000L).a().c();
                        }
                    } else {
                        this.a.a((ru.mail.libverify.m.m) null);
                    }
                    this.h.get().b(nVar.m());
                    ru.mail.libverify.m.l l = nVar.l();
                    if (l != null) {
                        String b2 = l.b();
                        String a3 = l.a();
                        if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(a3)) {
                            String a4 = q.this.a.a(b2, a3);
                            if (!TextUtils.isEmpty(a4)) {
                                this.j.get().a(a4);
                            }
                        }
                    }
                    if (lVar != null) {
                        if (lVar.B() != ru.mail.libverify.l.b.REPORT_SIGNOUT && lVar.B() != ru.mail.libverify.l.b.REPORT_SOFT_SIGNOUT) {
                            return;
                        }
                        a(true);
                        return;
                    }
                    return;
                }
                if (cVar instanceof ru.mail.libverify.m.k) {
                    ru.mail.libverify.requests.j jVar = (ru.mail.libverify.requests.j) ((ru.mail.libverify.m.k) cVar).a();
                    if (jVar != null) {
                        this.f.a(jVar.C());
                        String B = jVar.B();
                        if (B != null && (a2 = this.b.a(B, o.b.ALL)) != null) {
                            a2.a((ru.mail.libverify.m.k) cVar);
                        }
                    }
                    this.h.get().b(((ru.mail.libverify.m.k) cVar).h());
                    return;
                }
                return;
            }
            this.f.a(cVar);
            if (cVar.g() == Status.ERROR) {
                if (cVar.e() == DetailStatus.UNKNOWN_LIBVERIFY || cVar.e() == DetailStatus.UNDEFINED_PHONE) {
                    f(true);
                    FileLog.d("VerificationApi", "cancel started");
                    this.p.a();
                    this.a.a();
                    FileLog.d("VerificationApi", "cancel completed");
                }
            }
        } catch (Exception e2) {
            ru.mail.libverify.n0.b.a("VerificationApi", "api request process error", e2);
        }
    }

    private void a(@NonNull String str, @NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        ArrayList arrayList;
        s a2;
        s a3;
        if (verificationStateDescriptor.getState() == VerificationApi.VerificationState.FINAL) {
            ru.mail.libverify.j0.g.a(str);
        }
        if (!this.b.d(str)) {
            if (this.a.d("instance_background_verify") && (a3 = this.b.a(str, o.b.TEMPORARY)) != null && a3.m().completedSuccessfully()) {
                this.b.c(str);
                this.H.a(str);
                a3.a();
                this.f.f(a3);
                FileLog.v("VerificationApi", "temporary session %s state has been removed after completion (%s)", str, verificationStateDescriptor);
                return;
            }
            return;
        }
        if (verificationStateDescriptor.getState() == VerificationApi.VerificationState.SUCCEEDED && (a2 = this.b.a(str, o.b.ALL)) != null) {
            this.f.i(a2);
        }
        FileLog.v("VerificationApi", "session %s state changed to %s", str, verificationStateDescriptor);
        synchronized (this) {
            arrayList = new ArrayList(this.c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VerificationApi.VerificationStateChangedListener) it.next()).onStateChanged(str, verificationStateDescriptor);
        }
    }

    private void a(@NonNull Locale locale) {
        Locale d2 = this.a.d();
        this.a.setCustomLocale(locale);
        if (locale != d2) {
            this.p.post(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FEATURE_REPOSITORY_REINIT, new Object[0]));
            this.i.get().l();
            ru.mail.libverify.j0.b bVar = this.z.get();
            ru.mail.libverify.u.w wVar = this.a;
            ru.mail.libverify.j0.n.a(bVar, new ru.mail.libverify.requests.l(wVar, ru.mail.libverify.l.c.a(wVar.C().c())));
        }
    }
}
