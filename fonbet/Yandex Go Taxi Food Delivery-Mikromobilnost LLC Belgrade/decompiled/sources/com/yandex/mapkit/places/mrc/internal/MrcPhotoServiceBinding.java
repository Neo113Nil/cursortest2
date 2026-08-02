package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.mapkit.places.mrc.MrcPhotoService;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MrcPhotoServiceBinding implements MrcPhotoService {
    private final NativeObject nativeObject;

    public static class SearchSessionBinding implements MrcPhotoService.SearchSession {
        private final NativeObject nativeObject;

        public SearchSessionBinding(NativeObject nativeObject) {
            this.nativeObject = nativeObject;
        }

        @Override // com.yandex.mapkit.places.mrc.MrcPhotoService.SearchSession
        public native void cancel();

        @Override // com.yandex.mapkit.places.mrc.MrcPhotoService.SearchSession
        public native void retry(MrcPhotoService.SearchListener searchListener);
    }

    public MrcPhotoServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoService
    public native MrcPhotoService.SearchSession findNearestPhoto(MrcPhotoLayer.VisibleLayer visibleLayer, Point point, int i, MrcPhotoService.SearchListener searchListener);
}
