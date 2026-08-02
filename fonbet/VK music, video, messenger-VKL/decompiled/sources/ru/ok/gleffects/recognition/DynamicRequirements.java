package ru.ok.gleffects.recognition;

import androidx.annotation.NonNull;
import java.util.Arrays;
import xsna.n23;

/* loaded from: classes9.dex */
public class DynamicRequirements {
    public static DynamicRequirements EMPTY = new DynamicRequirements(-1, false, false, false, false, null, false, false, false, false);
    public final boolean friendsAvatarRequired;
    public final boolean friendsGeneralInfoRequired;
    public final boolean galleryAssetRequired;
    public final boolean gesturesRequired;
    public final String[] modelsRequired;
    public final int numFacesRequired;
    public final boolean personSegmentationRequired;
    public final boolean rotationMatrixRequired;
    public final boolean selfAvatarRequired;
    public final boolean selfGeneralInfoRequired;

    public DynamicRequirements(int i, boolean z, boolean z2, boolean z3, boolean z4, String[] strArr, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.numFacesRequired = i;
        this.gesturesRequired = z;
        this.personSegmentationRequired = z2;
        this.rotationMatrixRequired = z3;
        this.modelsRequired = strArr;
        this.galleryAssetRequired = z4;
        this.friendsGeneralInfoRequired = z5;
        this.friendsAvatarRequired = z6;
        this.selfGeneralInfoRequired = z7;
        this.selfAvatarRequired = z8;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicRequirements{numFacesRequired=");
        sb.append(this.numFacesRequired);
        sb.append(", personSegmentationRequired=");
        sb.append(this.personSegmentationRequired);
        sb.append(", rotationMatrixRequired=");
        sb.append(this.rotationMatrixRequired);
        sb.append(", gesturesRequired=");
        sb.append(this.gesturesRequired);
        sb.append(",galleryAssetRequired=");
        sb.append(this.galleryAssetRequired);
        sb.append(",modelsRequired=");
        String[] strArr = this.modelsRequired;
        sb.append(strArr != null ? Arrays.toString(strArr) : "null");
        sb.append(",friendsGeneralInfoRequired=");
        sb.append(this.friendsGeneralInfoRequired);
        sb.append(",friendsAvatarRequired=");
        sb.append(this.friendsAvatarRequired);
        sb.append(",selfGeneralInfoRequired=");
        sb.append(this.selfGeneralInfoRequired);
        sb.append(",selfAvatarRequired=");
        return n23.b(sb, this.selfAvatarRequired, ",}");
    }
}
