package com.yandex.div.internal.viewpool;

import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.epx;
import xsna.imi0;
import xsna.lmi0;
import xsna.oqm0;
import xsna.ozl;
import xsna.zcl;

/* compiled from: ViewPreCreationProfile.kt */
@imi0
/* loaded from: classes7.dex */
public final class ViewPreCreationProfile {
    public static final Companion Companion = new Companion(null);
    private final PreCreationModel custom;
    private final PreCreationModel gallery;
    private final PreCreationModel gifImage;
    private final PreCreationModel grid;
    private final String id;
    private final PreCreationModel image;
    private final PreCreationModel indicator;
    private final PreCreationModel input;
    private final PreCreationModel linearContainer;
    private final PreCreationModel overlapContainer;
    private final PreCreationModel pager;
    private final PreCreationModel select;
    private final PreCreationModel slider;
    private final PreCreationModel state;

    /* renamed from: switch, reason: not valid java name */
    private final PreCreationModel f49switch;
    private final PreCreationModel tab;
    private final PreCreationModel text;
    private final PreCreationModel video;
    private final PreCreationModel wrapContainer;

    /* compiled from: ViewPreCreationProfile.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<ViewPreCreationProfile> serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (zcl) null);
    }

    public static /* synthetic */ ViewPreCreationProfile copy$default(ViewPreCreationProfile viewPreCreationProfile, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i, Object obj) {
        PreCreationModel preCreationModel19;
        PreCreationModel preCreationModel20;
        String str2 = (i & 1) != 0 ? viewPreCreationProfile.id : str;
        PreCreationModel preCreationModel21 = (i & 2) != 0 ? viewPreCreationProfile.text : preCreationModel;
        PreCreationModel preCreationModel22 = (i & 4) != 0 ? viewPreCreationProfile.image : preCreationModel2;
        PreCreationModel preCreationModel23 = (i & 8) != 0 ? viewPreCreationProfile.gifImage : preCreationModel3;
        PreCreationModel preCreationModel24 = (i & 16) != 0 ? viewPreCreationProfile.overlapContainer : preCreationModel4;
        PreCreationModel preCreationModel25 = (i & 32) != 0 ? viewPreCreationProfile.linearContainer : preCreationModel5;
        PreCreationModel preCreationModel26 = (i & 64) != 0 ? viewPreCreationProfile.wrapContainer : preCreationModel6;
        PreCreationModel preCreationModel27 = (i & 128) != 0 ? viewPreCreationProfile.grid : preCreationModel7;
        PreCreationModel preCreationModel28 = (i & 256) != 0 ? viewPreCreationProfile.gallery : preCreationModel8;
        PreCreationModel preCreationModel29 = (i & 512) != 0 ? viewPreCreationProfile.pager : preCreationModel9;
        PreCreationModel preCreationModel30 = (i & 1024) != 0 ? viewPreCreationProfile.tab : preCreationModel10;
        PreCreationModel preCreationModel31 = (i & 2048) != 0 ? viewPreCreationProfile.state : preCreationModel11;
        PreCreationModel preCreationModel32 = (i & 4096) != 0 ? viewPreCreationProfile.custom : preCreationModel12;
        PreCreationModel preCreationModel33 = (i & 8192) != 0 ? viewPreCreationProfile.indicator : preCreationModel13;
        String str3 = str2;
        PreCreationModel preCreationModel34 = (i & 16384) != 0 ? viewPreCreationProfile.slider : preCreationModel14;
        PreCreationModel preCreationModel35 = (i & 32768) != 0 ? viewPreCreationProfile.input : preCreationModel15;
        PreCreationModel preCreationModel36 = (i & 65536) != 0 ? viewPreCreationProfile.select : preCreationModel16;
        PreCreationModel preCreationModel37 = (i & 131072) != 0 ? viewPreCreationProfile.video : preCreationModel17;
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            preCreationModel20 = preCreationModel37;
            preCreationModel19 = viewPreCreationProfile.f49switch;
        } else {
            preCreationModel19 = preCreationModel18;
            preCreationModel20 = preCreationModel37;
        }
        return viewPreCreationProfile.copy(str3, preCreationModel21, preCreationModel22, preCreationModel23, preCreationModel24, preCreationModel25, preCreationModel26, preCreationModel27, preCreationModel28, preCreationModel29, preCreationModel30, preCreationModel31, preCreationModel32, preCreationModel33, preCreationModel34, preCreationModel35, preCreationModel36, preCreationModel20, preCreationModel19);
    }

    public static final /* synthetic */ void write$Self(ViewPreCreationProfile viewPreCreationProfile, cti ctiVar, SerialDescriptor serialDescriptor) {
        if (ctiVar.z() || viewPreCreationProfile.id != null) {
            ctiVar.s(serialDescriptor, 0, oqm0.a, viewPreCreationProfile.id);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.text, new PreCreationModel(20, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 1, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.text);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.image, new PreCreationModel(20, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 2, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.image);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.gifImage, new PreCreationModel(3, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 3, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gifImage);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.overlapContainer, new PreCreationModel(8, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 4, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.overlapContainer);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.linearContainer, new PreCreationModel(12, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 5, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.linearContainer);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.wrapContainer, new PreCreationModel(4, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 6, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.wrapContainer);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.grid, new PreCreationModel(4, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 7, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.grid);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.gallery, new PreCreationModel(6, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 8, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gallery);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.pager, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 9, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.pager);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.tab, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 10, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.tab);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.state, new PreCreationModel(4, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 11, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.state);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.custom, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 12, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.custom);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.indicator, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 13, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.indicator);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.slider, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 14, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.slider);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.input, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 15, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.input);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.select, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 16, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.select);
        }
        if (ctiVar.z() || !epx.f(viewPreCreationProfile.video, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            ctiVar.n(serialDescriptor, 17, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.video);
        }
        if (!ctiVar.z() && epx.f(viewPreCreationProfile.f49switch, new PreCreationModel(2, 0, 0, 6, (zcl) null))) {
            return;
        }
        ctiVar.n(serialDescriptor, 18, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.f49switch);
    }

    public final ViewPreCreationProfile copy(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18) {
        return new ViewPreCreationProfile(str, preCreationModel, preCreationModel2, preCreationModel3, preCreationModel4, preCreationModel5, preCreationModel6, preCreationModel7, preCreationModel8, preCreationModel9, preCreationModel10, preCreationModel11, preCreationModel12, preCreationModel13, preCreationModel14, preCreationModel15, preCreationModel16, preCreationModel17, preCreationModel18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) obj;
        return epx.f(this.id, viewPreCreationProfile.id) && epx.f(this.text, viewPreCreationProfile.text) && epx.f(this.image, viewPreCreationProfile.image) && epx.f(this.gifImage, viewPreCreationProfile.gifImage) && epx.f(this.overlapContainer, viewPreCreationProfile.overlapContainer) && epx.f(this.linearContainer, viewPreCreationProfile.linearContainer) && epx.f(this.wrapContainer, viewPreCreationProfile.wrapContainer) && epx.f(this.grid, viewPreCreationProfile.grid) && epx.f(this.gallery, viewPreCreationProfile.gallery) && epx.f(this.pager, viewPreCreationProfile.pager) && epx.f(this.tab, viewPreCreationProfile.tab) && epx.f(this.state, viewPreCreationProfile.state) && epx.f(this.custom, viewPreCreationProfile.custom) && epx.f(this.indicator, viewPreCreationProfile.indicator) && epx.f(this.slider, viewPreCreationProfile.slider) && epx.f(this.input, viewPreCreationProfile.input) && epx.f(this.select, viewPreCreationProfile.select) && epx.f(this.video, viewPreCreationProfile.video) && epx.f(this.f49switch, viewPreCreationProfile.f49switch);
    }

    public final PreCreationModel getCustom() {
        return this.custom;
    }

    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    public final PreCreationModel getGrid() {
        return this.grid;
    }

    public final String getId() {
        return this.id;
    }

    public final PreCreationModel getImage() {
        return this.image;
    }

    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    public final PreCreationModel getInput() {
        return this.input;
    }

    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    public final PreCreationModel getPager() {
        return this.pager;
    }

    public final PreCreationModel getSelect() {
        return this.select;
    }

    public final PreCreationModel getSlider() {
        return this.slider;
    }

    public final PreCreationModel getState() {
        return this.state;
    }

    public final PreCreationModel getSwitch() {
        return this.f49switch;
    }

    public final PreCreationModel getTab() {
        return this.tab;
    }

    public final PreCreationModel getText() {
        return this.text;
    }

    public final PreCreationModel getVideo() {
        return this.video;
    }

    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    public int hashCode() {
        String str = this.id;
        return this.f49switch.hashCode() + ((this.video.hashCode() + ((this.select.hashCode() + ((this.input.hashCode() + ((this.slider.hashCode() + ((this.indicator.hashCode() + ((this.custom.hashCode() + ((this.state.hashCode() + ((this.tab.hashCode() + ((this.pager.hashCode() + ((this.gallery.hashCode() + ((this.grid.hashCode() + ((this.wrapContainer.hashCode() + ((this.linearContainer.hashCode() + ((this.overlapContainer.hashCode() + ((this.gifImage.hashCode() + ((this.image.hashCode() + ((this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ViewPreCreationProfile(id=" + this.id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.f49switch + ')';
    }

    @ozl
    public /* synthetic */ ViewPreCreationProfile(int i, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, lmi0 lmi0Var) {
        this.id = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.text = new PreCreationModel(20, 0, 0, 6, (zcl) null);
        } else {
            this.text = preCreationModel;
        }
        if ((i & 4) == 0) {
            this.image = new PreCreationModel(20, 0, 0, 6, (zcl) null);
        } else {
            this.image = preCreationModel2;
        }
        if ((i & 8) == 0) {
            this.gifImage = new PreCreationModel(3, 0, 0, 6, (zcl) null);
        } else {
            this.gifImage = preCreationModel3;
        }
        if ((i & 16) == 0) {
            this.overlapContainer = new PreCreationModel(8, 0, 0, 6, (zcl) null);
        } else {
            this.overlapContainer = preCreationModel4;
        }
        if ((i & 32) == 0) {
            this.linearContainer = new PreCreationModel(12, 0, 0, 6, (zcl) null);
        } else {
            this.linearContainer = preCreationModel5;
        }
        if ((i & 64) == 0) {
            this.wrapContainer = new PreCreationModel(4, 0, 0, 6, (zcl) null);
        } else {
            this.wrapContainer = preCreationModel6;
        }
        if ((i & 128) == 0) {
            this.grid = new PreCreationModel(4, 0, 0, 6, (zcl) null);
        } else {
            this.grid = preCreationModel7;
        }
        if ((i & 256) == 0) {
            this.gallery = new PreCreationModel(6, 0, 0, 6, (zcl) null);
        } else {
            this.gallery = preCreationModel8;
        }
        if ((i & 512) == 0) {
            this.pager = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.pager = preCreationModel9;
        }
        if ((i & 1024) == 0) {
            this.tab = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.tab = preCreationModel10;
        }
        if ((i & 2048) == 0) {
            this.state = new PreCreationModel(4, 0, 0, 6, (zcl) null);
        } else {
            this.state = preCreationModel11;
        }
        if ((i & 4096) == 0) {
            this.custom = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.custom = preCreationModel12;
        }
        if ((i & 8192) == 0) {
            this.indicator = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.indicator = preCreationModel13;
        }
        if ((i & 16384) == 0) {
            this.slider = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.slider = preCreationModel14;
        }
        if ((32768 & i) == 0) {
            this.input = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.input = preCreationModel15;
        }
        if ((65536 & i) == 0) {
            this.select = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.select = preCreationModel16;
        }
        if ((131072 & i) == 0) {
            this.video = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.video = preCreationModel17;
        }
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0) {
            this.f49switch = new PreCreationModel(2, 0, 0, 6, (zcl) null);
        } else {
            this.f49switch = preCreationModel18;
        }
    }

    public ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18) {
        this.id = str;
        this.text = preCreationModel;
        this.image = preCreationModel2;
        this.gifImage = preCreationModel3;
        this.overlapContainer = preCreationModel4;
        this.linearContainer = preCreationModel5;
        this.wrapContainer = preCreationModel6;
        this.grid = preCreationModel7;
        this.gallery = preCreationModel8;
        this.pager = preCreationModel9;
        this.tab = preCreationModel10;
        this.state = preCreationModel11;
        this.custom = preCreationModel12;
        this.indicator = preCreationModel13;
        this.slider = preCreationModel14;
        this.input = preCreationModel15;
        this.select = preCreationModel16;
        this.video = preCreationModel17;
        this.f49switch = preCreationModel18;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (zcl) null) : preCreationModel, (i & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (zcl) null) : preCreationModel2, (i & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (zcl) null) : preCreationModel3, (i & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (zcl) null) : preCreationModel4, (i & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (zcl) null) : preCreationModel5, (i & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (zcl) null) : preCreationModel6, (i & 128) != 0 ? new PreCreationModel(4, 0, 0, 6, (zcl) null) : preCreationModel7, (i & 256) != 0 ? new PreCreationModel(6, 0, 0, 6, (zcl) null) : preCreationModel8, (i & 512) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel9, (i & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel10, (i & 2048) != 0 ? new PreCreationModel(4, 0, 0, 6, (zcl) null) : preCreationModel11, (i & 4096) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel12, (i & 8192) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel13, (i & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel14, (i & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel15, (i & 65536) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel16, (i & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel17, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new PreCreationModel(2, 0, 0, 6, (zcl) null) : preCreationModel18);
    }
}
