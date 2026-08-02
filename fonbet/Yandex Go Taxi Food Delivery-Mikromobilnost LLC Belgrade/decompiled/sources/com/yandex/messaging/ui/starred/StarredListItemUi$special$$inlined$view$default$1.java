package com.yandex.messaging.ui.starred;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import defpackage.dr31;
import defpackage.k521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* synthetic */ class StarredListItemUi$special$$inlined$view$default$1 extends FunctionReferenceImpl implements zls {
    public static final StarredListItemUi$special$$inlined$view$default$1 b = new StarredListItemUi$special$$inlined$view$default$1();

    public StarredListItemUi$special$$inlined$view$default$1() {
        super(3, 1, dr31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback appCompatSeekBar;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue != 0 || intValue2 != 0) {
            return (AvatarImageView) (AvatarImageView.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : AvatarImageView.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : AvatarImageView.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : AvatarImageView.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : AvatarImageView.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : AvatarImageView.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : AvatarImageView.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : AvatarImageView.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : AvatarImageView.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : AvatarImageView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : AvatarImageView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : AvatarImageView.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : AvatarImageView.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : AvatarImageView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : AvatarImageView.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : AvatarImageView.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : AvatarImageView.class.equals(BrickSlotView.class) ? new BrickSlotView(context, null, intValue, intValue2) : AvatarImageView.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : AvatarImageView.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : AvatarImageView.class.equals(View.class) ? new View(context, null, intValue, intValue2) : AvatarImageView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : AvatarImageView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : k521.a(AvatarImageView.class, context, intValue, intValue2));
        }
        if (AvatarImageView.class.equals(TextView.class) ? true : AvatarImageView.class.equals(AppCompatTextView.class)) {
            appCompatSeekBar = new AppCompatTextView(context);
        } else if (AvatarImageView.class.equals(Button.class)) {
            appCompatSeekBar = new Button(context);
        } else {
            if (AvatarImageView.class.equals(ImageView.class) ? true : AvatarImageView.class.equals(AppCompatImageView.class)) {
                appCompatSeekBar = new AppCompatImageView(context);
            } else {
                if (AvatarImageView.class.equals(EditText.class) ? true : AvatarImageView.class.equals(AppCompatEditText.class)) {
                    appCompatSeekBar = new AppCompatEditText(context);
                } else if (AvatarImageView.class.equals(Spinner.class)) {
                    appCompatSeekBar = new Spinner(context);
                } else {
                    if (AvatarImageView.class.equals(ImageButton.class) ? true : AvatarImageView.class.equals(AppCompatImageButton.class)) {
                        appCompatSeekBar = new AppCompatImageButton(context);
                    } else {
                        if (AvatarImageView.class.equals(CheckBox.class) ? true : AvatarImageView.class.equals(AppCompatCheckBox.class)) {
                            appCompatSeekBar = new AppCompatCheckBox(context);
                        } else {
                            if (AvatarImageView.class.equals(RadioButton.class) ? true : AvatarImageView.class.equals(AppCompatRadioButton.class)) {
                                appCompatSeekBar = new AppCompatRadioButton(context);
                            } else if (AvatarImageView.class.equals(RadioGroup.class)) {
                                appCompatSeekBar = new RadioGroup(context);
                            } else if (AvatarImageView.class.equals(CheckedTextView.class)) {
                                appCompatSeekBar = new CheckedTextView(context);
                            } else if (AvatarImageView.class.equals(AutoCompleteTextView.class)) {
                                appCompatSeekBar = new AutoCompleteTextView(context);
                            } else if (AvatarImageView.class.equals(MultiAutoCompleteTextView.class)) {
                                appCompatSeekBar = new MultiAutoCompleteTextView(context);
                            } else {
                                if (AvatarImageView.class.equals(RatingBar.class) ? true : AvatarImageView.class.equals(AppCompatRatingBar.class)) {
                                    appCompatSeekBar = new AppCompatRatingBar(context);
                                } else {
                                    appCompatSeekBar = AvatarImageView.class.equals(SeekBar.class) ? true : AvatarImageView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context) : AvatarImageView.class.equals(ProgressBar.class) ? new ProgressBar(context) : AvatarImageView.class.equals(Space.class) ? new Space(context) : AvatarImageView.class.equals(BrickSlotView.class) ? new BrickSlotView(context) : AvatarImageView.class.equals(RecyclerView.class) ? new RecyclerView(context) : AvatarImageView.class.equals(View.class) ? new View(context) : AvatarImageView.class.equals(Toolbar.class) ? new Toolbar(context) : AvatarImageView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : AvatarImageView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : k521.b(context, AvatarImageView.class);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (AvatarImageView) appCompatSeekBar;
    }
}
