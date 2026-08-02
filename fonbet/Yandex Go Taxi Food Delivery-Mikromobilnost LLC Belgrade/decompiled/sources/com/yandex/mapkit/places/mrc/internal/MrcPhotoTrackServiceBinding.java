package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.places.mrc.MrcPhotoTrack;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackService;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MrcPhotoTrackServiceBinding implements MrcPhotoTrackService {
    private final NativeObject nativeObject;

    public static class MrcPhotoTrackSessionBinding implements MrcPhotoTrackService.MrcPhotoTrackSession {
        private final NativeObject nativeObject;

        public MrcPhotoTrackSessionBinding(NativeObject nativeObject) {
            this.nativeObject = nativeObject;
        }

        @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackService.MrcPhotoTrackSession
        public native void cancel();

        @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackService.MrcPhotoTrackSession
        public native void retry(MrcPhotoTrackService.MrcPhotoTrackListener mrcPhotoTrackListener);
    }

    public MrcPhotoTrackServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackService
    public native MrcPhotoTrackService.MrcPhotoTrackSession getMrcPhotoTrack(MrcPhotoTrack.TrackType trackType, Polyline polyline, MrcPhotoTrackService.MrcPhotoTrackListener mrcPhotoTrackListener);
}
