package ru.ok.android.webrtc.stat.ice;

import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.RTCErrorType;

/* loaded from: classes9.dex */
public final class IceCandidatesStatMapper {
    public final UrlParameterExtractor a = new UrlParameterExtractor("transport");

    public final IceCandidateAddFailedEvent mapAddFailure(String str, RTCErrorType rTCErrorType, IceCandidate iceCandidate) {
        return new IceCandidateAddFailedEvent(iceCandidate.toString(), rTCErrorType.getNative(), str);
    }

    public final IceCandidateGatheringFailedEvent mapGatheringFailure(IceCandidateErrorEvent iceCandidateErrorEvent) {
        String str = iceCandidateErrorEvent.address;
        String str2 = iceCandidateErrorEvent.url;
        String str3 = iceCandidateErrorEvent.errorText;
        if (str3 == null) {
            str3 = "empty description";
        }
        return new IceCandidateGatheringFailedEvent(str, str2, str3, iceCandidateErrorEvent.errorCode, str2 != null ? this.a.extract(str2) : null);
    }
}
