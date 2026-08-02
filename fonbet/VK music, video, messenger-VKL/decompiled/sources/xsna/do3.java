package xsna;

import androidx.preference.Preference;
import com.vk.articles.ArticleFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.stickers.views.sticker.ImStickerView;
import java.util.List;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.l3s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class do3 implements io.reactivex.rxjava3.functions.l, Function, io.reactivex.rxjava3.functions.m, Preference.c, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ do3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection lambda$process$5;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ArticleFragment.E0;
                break;
            case 2:
                lambda$process$5 = ((BodyPatternMatchingPipeline) obj2).lambda$process$5((Detection) obj);
                break;
            case 14:
                int i3 = FeedAnimatedView.y;
                break;
        }
        return (List) ((nl30) obj2).invoke(obj);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 9:
                break;
            case 20:
                int i2 = ImStickerView.p;
                break;
        }
        return ((Boolean) ((d9j) obj2).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (l3s.f.b) ((wci) this.c).invoke(obj, obj2);
    }
}
