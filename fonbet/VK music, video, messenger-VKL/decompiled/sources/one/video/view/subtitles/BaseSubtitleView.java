package one.video.view.subtitles;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import one.video.player.OneVideoPlayer;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.view.utils.SavedStateBundle;
import xsna.bpn0;
import xsna.h1n0;
import xsna.uo6;

/* compiled from: BaseSubtitleView.kt */
/* loaded from: classes8.dex */
public abstract class BaseSubtitleView extends FrameLayout implements h1n0 {
    public static final /* synthetic */ int g = 0;
    public final a b;
    public OneVideoPlayer c;
    public final bpn0 d;
    public final int e;
    public List<? extends SubtitleRenderItem> f;

    /* compiled from: BaseSubtitleView.kt */
    public static final class a implements OneVideoPlayer.e {
        public a() {
        }

        @Override // one.video.player.OneVideoPlayer.e
        public final void C(ArrayList arrayList) {
            BaseSubtitleView.this.setRenderItems(arrayList);
        }
    }

    public BaseSubtitleView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final int get_defaultBackgroundColor() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final int getDefaultBackgroundColor() {
        return get_defaultBackgroundColor();
    }

    public final int getDefaultTextColor() {
        return this.e;
    }

    public final OneVideoPlayer getPlayer() {
        return this.c;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedStateBundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedStateBundle savedStateBundle = (SavedStateBundle) parcelable;
        super.onRestoreInstanceState(savedStateBundle.getSuperState());
        Bundle bundle = savedStateBundle.b;
        if (bundle != null) {
            setRenderItems(Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("current_items", SubtitleRenderItem.class) : bundle.getParcelableArrayList("current_items"));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        List<? extends SubtitleRenderItem> list = this.f;
        if (list != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.addAll(list);
            bundle = new Bundle();
            bundle.putParcelableArrayList("current_items", arrayList);
        } else {
            bundle = null;
        }
        return new SavedStateBundle(onSaveInstanceState, bundle);
    }

    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer oneVideoPlayer2 = this.c;
        a aVar = this.b;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.H(aVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.a0(aVar);
        }
        this.c = oneVideoPlayer;
        setRenderItems(null);
    }

    public void setRenderItems(List<? extends SubtitleRenderItem> list) {
        this.f = list;
    }

    public BaseSubtitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public BaseSubtitleView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ BaseSubtitleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public BaseSubtitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new a();
        this.d = new bpn0(new uo6(context, 0));
        this.e = -1;
    }
}
