package com.yandex.messaging.domain.reactions;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.fai0;
import defpackage.k4o;
import defpackage.oyh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b(\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/yandex/messaging/domain/reactions/ReactionCodes;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "a", "()I", "contentDescRes", "b", "Companion", "fai0", "Checkmark", "ThumbsUp", "ThumbsDown", "Fire", "Cry", "Scared", "Goose", "Smile", "Heart", "Eyes", "Plus", "Terrible", "FourPlus", "Ok", "Mindblowing", "Heartbroke", "Salute", "Puke", "Poo", "Hand", "Sigma", "Facepalm", "Celebration", "Minus", "Inlove", "Think", "Clown", "Pokerface", "Applause", "Glass", "OneHundred", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReactionCodes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReactionCodes[] $VALUES;
    public static final ReactionCodes Applause;
    public static final ReactionCodes Celebration;
    public static final ReactionCodes Checkmark;
    public static final ReactionCodes Clown;
    public static final fai0 Companion;
    public static final ReactionCodes Cry;
    public static final ReactionCodes Eyes;
    public static final ReactionCodes Facepalm;
    public static final ReactionCodes Fire;
    public static final ReactionCodes FourPlus;
    public static final ReactionCodes Glass;
    public static final ReactionCodes Goose;
    public static final ReactionCodes Hand;
    public static final ReactionCodes Heart;
    public static final ReactionCodes Heartbroke;
    public static final ReactionCodes Inlove;
    public static final ReactionCodes Mindblowing;
    public static final ReactionCodes Minus;
    public static final ReactionCodes Ok;
    public static final ReactionCodes OneHundred;
    public static final ReactionCodes Plus;
    public static final ReactionCodes Pokerface;
    public static final ReactionCodes Poo;
    public static final ReactionCodes Puke;
    public static final ReactionCodes Salute;
    public static final ReactionCodes Scared;
    public static final ReactionCodes Sigma;
    public static final ReactionCodes Smile;
    public static final ReactionCodes Terrible;
    public static final ReactionCodes Think;
    public static final ReactionCodes ThumbsDown;
    public static final ReactionCodes ThumbsUp;
    private final int code;
    private final int contentDescRes;

    static {
        ReactionCodes reactionCodes = new ReactionCodes("Checkmark", 0, 100101, oyh0.reaction_checkmark_content_desc);
        Checkmark = reactionCodes;
        ReactionCodes reactionCodes2 = new ReactionCodes("ThumbsUp", 1, 100102, oyh0.reaction_thumbs_up_content_desc);
        ThumbsUp = reactionCodes2;
        ReactionCodes reactionCodes3 = new ReactionCodes("ThumbsDown", 2, 100103, oyh0.reaction_thumbs_down_content_desc);
        ThumbsDown = reactionCodes3;
        ReactionCodes reactionCodes4 = new ReactionCodes("Fire", 3, 100104, oyh0.reaction_fire_content_desc);
        Fire = reactionCodes4;
        ReactionCodes reactionCodes5 = new ReactionCodes("Cry", 4, 100105, oyh0.reaction_cry_content_desc);
        Cry = reactionCodes5;
        ReactionCodes reactionCodes6 = new ReactionCodes("Scared", 5, 100106, oyh0.reaction_scared_content_desc);
        Scared = reactionCodes6;
        ReactionCodes reactionCodes7 = new ReactionCodes("Goose", 6, 100107, oyh0.reaction_goose_content_desc);
        Goose = reactionCodes7;
        ReactionCodes reactionCodes8 = new ReactionCodes("Smile", 7, 100108, oyh0.reaction_smile_content_desc);
        Smile = reactionCodes8;
        ReactionCodes reactionCodes9 = new ReactionCodes("Heart", 8, 100109, oyh0.reaction_heart_content_desc);
        Heart = reactionCodes9;
        ReactionCodes reactionCodes10 = new ReactionCodes("Eyes", 9, 100110, oyh0.reaction_eyes_content_desc);
        Eyes = reactionCodes10;
        ReactionCodes reactionCodes11 = new ReactionCodes("Plus", 10, 100111, oyh0.reaction_plus_content_desc);
        Plus = reactionCodes11;
        ReactionCodes reactionCodes12 = new ReactionCodes("Terrible", 11, 100112, oyh0.reaction_terrible_content_desc);
        Terrible = reactionCodes12;
        ReactionCodes reactionCodes13 = new ReactionCodes("FourPlus", 12, 100113, oyh0.reaction_4plus_content_desc);
        FourPlus = reactionCodes13;
        ReactionCodes reactionCodes14 = new ReactionCodes("Ok", 13, 100114, oyh0.reaction_ok_content_desc);
        Ok = reactionCodes14;
        ReactionCodes reactionCodes15 = new ReactionCodes("Mindblowing", 14, 100115, oyh0.reaction_mindblowing_content_desc);
        Mindblowing = reactionCodes15;
        ReactionCodes reactionCodes16 = new ReactionCodes("Heartbroke", 15, 100116, oyh0.reaction_heartbroke_content_desc);
        Heartbroke = reactionCodes16;
        ReactionCodes reactionCodes17 = new ReactionCodes("Salute", 16, 100117, oyh0.reaction_salute_content_desc);
        Salute = reactionCodes17;
        ReactionCodes reactionCodes18 = new ReactionCodes("Puke", 17, 100118, oyh0.reaction_puke_content_desc);
        Puke = reactionCodes18;
        ReactionCodes reactionCodes19 = new ReactionCodes("Poo", 18, 100119, oyh0.reaction_poo_content_desc);
        Poo = reactionCodes19;
        ReactionCodes reactionCodes20 = new ReactionCodes("Hand", 19, 100120, oyh0.reaction_hand_content_desc);
        Hand = reactionCodes20;
        ReactionCodes reactionCodes21 = new ReactionCodes("Sigma", 20, 100121, oyh0.reaction_sigma_content_desc);
        Sigma = reactionCodes21;
        ReactionCodes reactionCodes22 = new ReactionCodes("Facepalm", 21, 100122, oyh0.reaction_facepalm_content_desc);
        Facepalm = reactionCodes22;
        ReactionCodes reactionCodes23 = new ReactionCodes("Celebration", 22, 100123, oyh0.reaction_celebration_content_desc);
        Celebration = reactionCodes23;
        ReactionCodes reactionCodes24 = new ReactionCodes("Minus", 23, 100124, oyh0.reaction_minus_content_desc);
        Minus = reactionCodes24;
        ReactionCodes reactionCodes25 = new ReactionCodes("Inlove", 24, 100125, oyh0.reaction_inlove_content_desc);
        Inlove = reactionCodes25;
        ReactionCodes reactionCodes26 = new ReactionCodes("Think", 25, 100126, oyh0.reaction_think_content_desc);
        Think = reactionCodes26;
        ReactionCodes reactionCodes27 = new ReactionCodes("Clown", 26, 100127, oyh0.reaction_clown_content_desc);
        Clown = reactionCodes27;
        ReactionCodes reactionCodes28 = new ReactionCodes("Pokerface", 27, 100128, oyh0.reaction_pokerface_content_desc);
        Pokerface = reactionCodes28;
        ReactionCodes reactionCodes29 = new ReactionCodes("Applause", 28, 100129, oyh0.reaction_applause_content_desc);
        Applause = reactionCodes29;
        ReactionCodes reactionCodes30 = new ReactionCodes("Glass", 29, 100130, oyh0.reaction_glass_content_desc);
        Glass = reactionCodes30;
        ReactionCodes reactionCodes31 = new ReactionCodes("OneHundred", 30, 100131, oyh0.reaction_onehundred_content_desc);
        OneHundred = reactionCodes31;
        ReactionCodes[] reactionCodesArr = {reactionCodes, reactionCodes2, reactionCodes3, reactionCodes4, reactionCodes5, reactionCodes6, reactionCodes7, reactionCodes8, reactionCodes9, reactionCodes10, reactionCodes11, reactionCodes12, reactionCodes13, reactionCodes14, reactionCodes15, reactionCodes16, reactionCodes17, reactionCodes18, reactionCodes19, reactionCodes20, reactionCodes21, reactionCodes22, reactionCodes23, reactionCodes24, reactionCodes25, reactionCodes26, reactionCodes27, reactionCodes28, reactionCodes29, reactionCodes30, reactionCodes31};
        $VALUES = reactionCodesArr;
        $ENTRIES = a.a(reactionCodesArr);
        Companion = new fai0();
    }

    public ReactionCodes(String str, int i, int i2, int i3) {
        this.code = i2;
        this.contentDescRes = i3;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static ReactionCodes valueOf(String str) {
        return (ReactionCodes) Enum.valueOf(ReactionCodes.class, str);
    }

    public static ReactionCodes[] values() {
        return (ReactionCodes[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final int getContentDescRes() {
        return this.contentDescRes;
    }
}
