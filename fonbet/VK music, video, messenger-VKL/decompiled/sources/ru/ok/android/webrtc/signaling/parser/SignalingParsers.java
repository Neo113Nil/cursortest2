package ru.ok.android.webrtc.signaling.parser;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.asr.AsrParser;
import ru.ok.android.webrtc.signaling.chat.ChatParser;
import ru.ok.android.webrtc.signaling.contactcall.ContactCallParser;
import ru.ok.android.webrtc.signaling.feature.CallFeatureParser;
import ru.ok.android.webrtc.signaling.feedback.FeedbackParser;
import ru.ok.android.webrtc.signaling.movie.MovieSharesInfoParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantListChunkParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantListParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantStateParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantsParser;
import ru.ok.android.webrtc.signaling.record.RecordInfoParser;
import ru.ok.android.webrtc.signaling.roles.CallParticipantRolesParser;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomParticipantsUpdateParser;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomUpdateParser;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomsParser;
import ru.ok.android.webrtc.signaling.urlsharing.UrlSharingParser;
import ru.ok.android.webrtc.signaling.waitingroom.WaitingRoomNotificationParser;

/* loaded from: classes9.dex */
public final class SignalingParsers {
    public final AsrParser asrParser;
    public final ChatParser chatParser;
    public final ContactCallParser contactCallParser;
    public final CallFeatureParser featureParser;
    public final FeedbackParser feedbackParser;
    public final MovieSharesInfoParser movieSharesInfoParser;
    public final ParticipantListChunkParser participantListChunkParser;
    public final ParticipantListParser participantListParser;
    public final ParticipantStateParser participantStateParser;
    public final ParticipantsParser participantsParser;
    public final RecordInfoParser recordInfoParser;
    public final CallParticipantRolesParser rolesParser;
    public final SessionRoomCommonParser sessionRoomCommonParser;
    public final SessionRoomParticipantsUpdateParser sessionRoomParticipantsUpdateParser;
    public final SessionRoomUpdateParser sessionRoomUpdateParser;
    public final SessionRoomsParser sessionRoomsParser;
    public final UrlSharingParser urlSharingParser;
    public final WaitingRoomNotificationParser waitingRoomParser;

    public SignalingParsers(RTCLog rTCLog, CallParticipant callParticipant, CallMediaOptionsDelegate callMediaOptionsDelegate) {
        MovieSharesInfoParser movieSharesInfoParser = new MovieSharesInfoParser(rTCLog);
        this.movieSharesInfoParser = movieSharesInfoParser;
        this.featureParser = new CallFeatureParser();
        FeedbackParser feedbackParser = new FeedbackParser();
        this.feedbackParser = feedbackParser;
        this.rolesParser = new CallParticipantRolesParser();
        ParticipantsParser participantsParser = new ParticipantsParser(rTCLog);
        this.participantsParser = participantsParser;
        ParticipantStateParser participantStateParser = new ParticipantStateParser(rTCLog);
        this.participantStateParser = participantStateParser;
        ParticipantListParser participantListParser = new ParticipantListParser(rTCLog, callParticipant, callMediaOptionsDelegate, movieSharesInfoParser, participantStateParser);
        this.participantListParser = participantListParser;
        ParticipantListChunkParser participantListChunkParser = new ParticipantListChunkParser(rTCLog, participantListParser);
        this.participantListChunkParser = participantListChunkParser;
        SessionRoomCommonParser sessionRoomCommonParser = new SessionRoomCommonParser(rTCLog);
        this.sessionRoomCommonParser = sessionRoomCommonParser;
        RecordInfoParser recordInfoParser = new RecordInfoParser(rTCLog, sessionRoomCommonParser);
        this.recordInfoParser = recordInfoParser;
        AsrParser asrParser = new AsrParser(rTCLog, sessionRoomCommonParser);
        this.asrParser = asrParser;
        UrlSharingParser urlSharingParser = new UrlSharingParser(rTCLog, sessionRoomCommonParser);
        this.urlSharingParser = urlSharingParser;
        this.chatParser = new ChatParser(rTCLog);
        SessionRoomUpdateParser sessionRoomUpdateParser = new SessionRoomUpdateParser(rTCLog, participantsParser, participantListChunkParser, recordInfoParser, asrParser, urlSharingParser);
        this.sessionRoomUpdateParser = sessionRoomUpdateParser;
        this.sessionRoomParticipantsUpdateParser = new SessionRoomParticipantsUpdateParser(rTCLog, sessionRoomCommonParser, participantsParser, participantListParser);
        this.sessionRoomsParser = new SessionRoomsParser(rTCLog, sessionRoomCommonParser, sessionRoomUpdateParser);
        this.waitingRoomParser = new WaitingRoomNotificationParser(rTCLog, feedbackParser, participantsParser);
        this.contactCallParser = new ContactCallParser(rTCLog);
    }
}
