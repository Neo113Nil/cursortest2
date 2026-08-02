package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vkontakte.android.R;

/* compiled from: ShareStoryPreview.kt */
/* loaded from: classes6.dex */
public final class r8j0 extends ConstraintLayout {
    public final TextView t;
    public final TextView u;
    public final View v;
    public View.OnClickListener w;
    public View.OnClickListener x;

    /* compiled from: ShareStoryPreview.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryPrivacyType.EXCLUDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r8j0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_story_share_preview, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        TextView textView = (TextView) findViewById(R.id.share_privacy);
        bwt0.i0(textView, new ksg0(this, 1));
        this.t = textView;
        TextView textView2 = (TextView) findViewById(R.id.share_live);
        bwt0.i0(textView2, new j5b0(this, 10));
        this.u = textView2;
        this.v = findViewById(R.id.bottom_container);
    }

    public final View getBottomContainer() {
        return this.v;
    }

    public final TextView getLifeTimeBtn() {
        return this.u;
    }

    public final TextView getPrivacyBtn() {
        return this.t;
    }

    public final void setLifeTime(int i) {
        this.u.setText(i != 1 ? i != 12 ? i != 24 ? i != 48 ? getContext().getString(R.string.story_lifetime_24h) : getContext().getString(R.string.story_lifetime_48h) : getContext().getString(R.string.story_lifetime_24h) : getContext().getString(R.string.story_lifetime_12h) : getContext().getString(R.string.story_lifetime_1h));
    }

    public final void setLifetimeClickListener(View.OnClickListener onClickListener) {
        this.x = onClickListener;
    }

    public final void setPrivacyClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
    }
}
