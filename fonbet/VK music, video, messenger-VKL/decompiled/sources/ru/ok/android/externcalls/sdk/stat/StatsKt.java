package ru.ok.android.externcalls.sdk.stat;

import java.math.BigInteger;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.SelfRefKeyProp;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.animoji.stats.AnimojiParticipantStat;
import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.camera.CameraStat;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.izs;
import xsna.j7e0;
import xsna.wzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatsKt {
    private static final double MILLIS_IN_SECOND_D = 1000.0d;

    private static final double adjustToPerSecond(long j, long j2) {
        return j / (j2 / MILLIS_IN_SECOND_D);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> animoji(KeyPropBehavior keyPropBehavior, wzs<? super AnimojiStat, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$animoji$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 animoji$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$animoji$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> animojiForParticipant(KeyPropBehavior keyPropBehavior, wzs<? super AnimojiParticipantStat, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$animojiForParticipant$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 animojiForParticipant$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$animojiForParticipant$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> audioIn(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.AudioRecv, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 audioIn$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> audioOut(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.AudioSend, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$audioOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 audioOut$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$audioOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> camera(KeyPropBehavior keyPropBehavior, wzs<? super CameraStat, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$camera$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 camera$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$camera$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> candidatePair(KeyPropBehavior keyPropBehavior, wzs<? super CandidatePair, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$candidatePair$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 candidatePair$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$candidatePair$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> derive(StatKey<? extends V> statKey, KeyPropBehavior keyPropBehavior, wzs<? super StatValue<? extends V>, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$derive$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), wzsVar, statKey);
    }

    public static /* synthetic */ j7e0 derive$default(StatKey statKey, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        KeyPropBehavior keyPropBehavior2 = (i & 2) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$derive$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), wzsVar, statKey);
    }

    private static final j7e0<StatGroup, KeyProp<Long>> diff(StatKey<Long> statKey, KeyPropBehavior keyPropBehavior, izs<? super Long, Long> izsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$diff$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    public static /* synthetic */ j7e0 diff$default(StatKey statKey, KeyPropBehavior keyPropBehavior, izs izsVar, int i, Object obj) {
        KeyPropBehavior keyPropBehavior2 = (i & 2) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        if ((i & 4) != 0) {
            izsVar = new izs<Long, Long>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$diff$1
                public final Long invoke(long j) {
                    return Long.valueOf(j);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ Long invoke(Long l) {
                    return invoke(l.longValue());
                }
            };
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$diff$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    private static final j7e0<StatGroup, KeyProp<Double>> ema(StatKey<Double> statKey, double d, KeyPropBehavior keyPropBehavior) {
        SelfRefKeyProp.Companion companion = SelfRefKeyProp.Companion;
        return new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey, d);
    }

    public static /* synthetic */ j7e0 ema$default(StatKey statKey, double d, KeyPropBehavior keyPropBehavior, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.3d;
        }
        KeyPropBehavior keyPropBehavior2 = (i & 4) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        SelfRefKeyProp.Companion companion = SelfRefKeyProp.Companion;
        return new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey, d);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> forward(StatKey<? extends V> statKey, KeyPropBehavior keyPropBehavior) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$forward$$inlined$derive$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey);
    }

    public static /* synthetic */ j7e0 forward$default(StatKey statKey, KeyPropBehavior keyPropBehavior, int i, Object obj) {
        KeyPropBehavior keyPropBehavior2 = (i & 2) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$forward$$inlined$derive$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey);
    }

    private static final <V> V getV(StatValue<? extends V> statValue) {
        return statValue.getValue();
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> layout(VideoTrackType videoTrackType, KeyPropBehavior keyPropBehavior, wzs<? super CallDisplayLayoutItem, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$layout$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, videoTrackType, wzsVar);
    }

    public static /* synthetic */ j7e0 layout$default(VideoTrackType videoTrackType, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$layout$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, videoTrackType, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> ns(KeyPropBehavior keyPropBehavior, wzs<? super NoiseSuppressorActiveState, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$ns$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 ns$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$ns$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> participantVideoIn(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.VideoRecv, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$participantVideoIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 participantVideoIn$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$participantVideoIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    private static final j7e0<StatGroup, KeyProp<Double>> perSecond(StatKey<Long> statKey, KeyPropBehavior keyPropBehavior, izs<? super Long, Long> izsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$perSecond$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    public static /* synthetic */ j7e0 perSecond$default(StatKey statKey, KeyPropBehavior keyPropBehavior, izs izsVar, int i, Object obj) {
        KeyPropBehavior keyPropBehavior2 = (i & 2) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        if ((i & 4) != 0) {
            izsVar = new izs<Long, Long>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$perSecond$1
                public final Long invoke(long j) {
                    return Long.valueOf(j);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ Long invoke(Long l) {
                    return invoke(l.longValue());
                }
            };
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$perSecond$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    private static final j7e0<StatGroup, KeyProp<Double>> perSecondBigInteger(StatKey<? extends BigInteger> statKey, KeyPropBehavior keyPropBehavior, izs<? super BigInteger, Long> izsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$perSecondBigInteger$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    public static /* synthetic */ j7e0 perSecondBigInteger$default(StatKey statKey, KeyPropBehavior keyPropBehavior, izs izsVar, int i, Object obj) {
        KeyPropBehavior keyPropBehavior2 = (i & 2) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        if ((i & 4) != 0) {
            izsVar = new izs<BigInteger, Long>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$perSecondBigInteger$1
                @Override // xsna.izs
                public final Long invoke(BigInteger bigInteger) {
                    return Long.valueOf(bigInteger.longValue());
                }
            };
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$perSecondBigInteger$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey, izsVar);
    }

    private static final j7e0<StatGroup, KeyProp<Double>> percentEma(StatKey<Double> statKey, StatKey<Double> statKey2, double d, KeyPropBehavior keyPropBehavior) {
        SelfRefKeyProp.Companion companion = SelfRefKeyProp.Companion;
        return new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), statKey, statKey2, d);
    }

    public static /* synthetic */ j7e0 percentEma$default(StatKey statKey, StatKey statKey2, double d, KeyPropBehavior keyPropBehavior, int i, Object obj) {
        double d2 = (i & 4) != 0 ? 0.3d : d;
        KeyPropBehavior keyPropBehavior2 = (i & 8) != 0 ? new KeyPropBehavior(false, false, false, false, false, 31, null) : keyPropBehavior;
        SelfRefKeyProp.Companion companion = SelfRefKeyProp.Companion;
        return new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), statKey, statKey2, d2);
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> screenshareRecv(KeyPropBehavior keyPropBehavior, wzs<? super ScreenshareRecvStat, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$screenshareRecv$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 screenshareRecv$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$screenshareRecv$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParticipantId toExternal(CallParticipant.ParticipantId participantId, InnerExtractionContext innerExtractionContext) {
        ConversationParticipant byInternal = innerExtractionContext.getConversation().getParticipants().getByInternal(participantId);
        if (byInternal != null) {
            return byInternal.getExternalId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallParticipant.ParticipantId toInternal(ParticipantId participantId, InnerExtractionContext innerExtractionContext) {
        CallParticipant callParticipant;
        ConversationParticipant participantById = innerExtractionContext.getConversation().getParticipants().getParticipantById(participantId);
        if (participantById == null || (callParticipant = participantById.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.getParticipantId();
    }

    private static final Set<StatKey<?>> toRenderable(Set<? extends StatKey<?>> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            StatKey statKey = (StatKey) obj;
            if (!statKey.getSynthetic() && statKey.getHumanReadable()) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    private static final <V> j7e0<StatGroup, KeyProp<V>> videoOut(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.VideoSend, ? super InnerExtractionContext, ? extends V> wzsVar) {
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$videoOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }

    public static /* synthetic */ j7e0 videoOut$default(KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        return new StatsKt$videoOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
    }
}
